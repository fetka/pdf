package com.example.pdf.chart;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicChart implements CommandLineRunner {

  public static void main(String[] args) {
//    SpringApplication.run(BasicChart.class, args);
    SpringApplicationBuilder builder = new SpringApplicationBuilder(BasicChart.class);

    builder.headless(false);

    ConfigurableApplicationContext context = builder.run(args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("running");
//    basicLineChart();
    pieChart();
  }

  public void basicLineChart() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    dataset.addValue(200, "Sales", "January");
    dataset.addValue(150, "Sales", "February");
    dataset.addValue(180, "Sales", "March");
    dataset.addValue(260, "Sales", "April");
    dataset.addValue(300, "Sales", "May");

    JFreeChart chart = ChartFactory.createLineChart(
        "Monthly Sales",
        "Month",
        "Sales",
        dataset);
    draw(chart);
  }

  public void pieChart() {
    DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
    dataset.setValue("January", 200);
    dataset.setValue("February", 150);
    dataset.setValue("March", 180);

    JFreeChart chart = ChartFactory.createPieChart(
        "Monthly Sales",
        dataset,
        true,    // include legend
        true,    // generate tooltips
        false);  // no URLs
    draw(chart);
  }

  public void draw(JFreeChart chart) {
    ChartPanel chartPanel = new ChartPanel(chart);
    JFrame frame = new JFrame();
    frame.setSize(800, 600);
    frame.setContentPane(chartPanel);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
