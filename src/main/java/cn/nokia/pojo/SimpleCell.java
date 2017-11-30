package cn.nokia.pojo;

import java.util.Arrays;

public class SimpleCell extends Cell {


    public SimpleCell(String cellid, String endid, double brng, double lon, double lat, double dist) {
        super(cellid, endid, brng, lon, lat, dist);
    }


    public static SimpleCell SimpleCell(String cell) {

        double brng;
        double lon;
        double lat;
        double dist;


        String[] array = cell.split(",");

        if (array[2].length() > 0) {
            brng = Double.parseDouble(array[2]);
        } else {
            brng = 0;
        }

        if (array[3].length() > 0) {
            lon = Double.parseDouble(array[3]);
        } else {
            throw new RuntimeException("null");
        }


        if (array[4].length() > 0) {
            lat = Double.parseDouble(array[4]);
        } else {
            lat = 0;
        }

        if (array[5].length() > 0) {
            dist = Double.parseDouble(array[5]);
        } else {
            dist = 0;
        }
        return new SimpleCell(array[0], array[1], brng, lon, lat, dist);
    }
}
