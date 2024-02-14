package ProjectTools;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.Drawable;

import java.io.File;
import java.io.IOException;

/**
 * Class for generating plot charts. Uses JFreeChart library.
 * @author Cheryl Moser
 */
public class PlotGenerator {

    private final String title;
    private final String[] arraySize = {"5", "10", "15", "20", "25", "30"};
    private final String xLabel = "Input Array Size";
    private final String yLabel = "Time (in microseconds)";
    private final int width = 800;
    private final int height = 600;

    //default constructor
    public PlotGenerator(String title){
        this.title = title;
    }

    /**
     * Creates a line chart using values from a list of recorded execution times
     * (y-axis), and input size (x-axis).
     * @param times List of 6 execution times correlating to 6 array sizes.
     * @param fileName User-specified file path for jpg output.
     * @author Cheryl Moser
     */
    public void lineChart(double[] times, String fileName){

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        //iterate through the list of time(ms) values
        for (int i = 0; i < times.length; i++) {
            //add data point to chart
            dataset.addValue(times[i], "Data", arraySize[i]);
        }

        //create line chart using data points
        JFreeChart chart = ChartFactory.createLineChart(title, xLabel, yLabel, dataset, PlotOrientation.VERTICAL, false, true, true);
        //set auto range to include a range containing x-values (may not work in IDE GUI)
        chart.getCategoryPlot().getRangeAxis().setAutoRange(true);
        //call to method for generating image files
        toImage(chart, fileName);
    }

    /**
     * Generates a plot image file (jpg).
     * @param chart The chart generated from xy data points.
     * @param fileName User-specified file path for jpg output.
     * @author Cheryl Moser
     */
    private void toImage(JFreeChart chart, String fileName){
        try {
            //create file & save as jpg
            File plot = new File(fileName);
            ChartUtilities.saveChartAsJPEG(plot, chart, width, height);
        } catch (IOException e){
            e.getMessage();
        }
    }
}
