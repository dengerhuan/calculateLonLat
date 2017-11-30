package cn.nokia.pojo;

public class Cell {

    public String getCellid() {
        return cellid;
    }

    public void setCellid(String cellid) {
        this.cellid = cellid;
    }

    public String getEndid() {
        return endid;
    }

    public void setEndid(String endid) {
        this.endid = endid;
    }

    public double getBrng() {
        return brng;
    }

    public void setBrng(double brng) {
        this.brng = brng;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    private String cellid;
    private String endid;
    private double brng;
    private double lon;
    private double lat;
    private double dist;

    public Cell() {

    }

    @Override
    public String toString() {
        return cellid + "," + endid + "," + brng + "," + lon + "," + lat + "," + dist;
    }

    public Cell(String cellid, String endid, double brng, double lon, double lat, double dist) {
        this.cellid = cellid;
        this.endid = endid;
        this.brng = brng;
        this.lon = lon;
        this.lat = lat;
        this.dist = dist;
    }

}
