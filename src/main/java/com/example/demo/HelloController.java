package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws JRException, SQLException {
        welcomeText.setText("Welcome to JavaFX Application!");
        /*Connection connection = DriverManager.getConnection("jdbc:mariadb://terfezio.com:3306/seguros", "seguros", "itno24");
        Map parametros = new HashMap();
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(new File("C:\\Users\\raul\\JaspersoftWorkspace\\test\\mariadb.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, connection);
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setTitle("Test");
        jasperViewer.setVisible(true);*/

        Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
        JasperReport jasperReport = JasperCompileManager.compileReport("src/main/java/com/example/demo/test2.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, connection);
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setTitle("Title");
        jasperViewer.setVisible(true);
        /*List<DemoBean> demoBeanList = new ArrayList<>();
        DemoBean demoBean = new DemoBean("Pepe", "Perez");
        DemoBean demoBean1 = new DemoBean("Juan", "Ramos");
        demoBeanList.add(demoBean);
        demoBeanList.add(demoBean1);
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(demoBeanList);

        //InputStream demoBeanStream = getClass().getResourceAsStream("src/main/java/com/example/demo/report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport("src/main/java/com/example/demo/report.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
        JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setTitle("Title");
        jasperViewer.setVisible(true);*/
    }

}