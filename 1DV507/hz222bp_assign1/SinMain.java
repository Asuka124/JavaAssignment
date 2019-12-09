package hz222bp_assign1;

import org.knowm.xchart.*;

/*
 * Assignment 1; Exercise 6
 * Hailing Zhang(hz222bp) 
 * 2017-01-23
 */
public class SinMain {
	public static void main(String[] args) {
		int maxStep = 40;

		double[] xData = new double[maxStep];//X-axis
		for (int i = 0; i < maxStep; i++)
			xData[i] = 2 * Math.PI / maxStep * i;
		
		double[] yData = new double[maxStep];//Y-axis
		yData = new double[xData.length];
		for (int i = 0; i < xData.length; i++)
			yData[i] = (1 + xData[i] / Math.PI) * Math.cos(xData[i]) * Math.cos(40 * xData[i]);

		// Display
		XYChart chart = QuickChart.getChart("Sin chart", "X", "Y", "y(x)", xData, yData);
		new SwingWrapper(chart).displayChart();

	}
}
