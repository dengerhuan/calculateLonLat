import cn.nokia.pojo.SimpleCell;
import cn.nokia.pro4j.CalculatePoint;

import java.io.*;

public class entryClass {

    public static void main(String[] args) throws IOException {


        String filename = "cell.csv";
        if (args.length > 0) {
            filename = args[0];
        }

        CalculatePoint calculatePoint = new CalculatePoint();

        File f = new File(filename);
        if (!f.exists()) {
            throw new RuntimeException("配置文件不存在或者配置文件不是csv格式");
        }


        BufferedReader br = new entryClass().readFile(f);


        int i = 0;
        System.out.println(br.readLine());
        String line = null;

        File re = new File("result.csv");


        if (!re.exists())
            re.createNewFile();

        BufferedWriter brw = new BufferedWriter(new FileWriter(re));

        brw.write("cellid,endid,blur,lon,lat,dist,blon,blat \n");

        while ((line = br.readLine()) != null) {


            SimpleCell sim = SimpleCell.SimpleCell(line);


            String res = sim + calculatePoint.computerThatLonLat(sim.getLat(), sim.getLon(), sim.getBrng(), sim.getDist()).toString();


            brw.write(res + "\r");

        }

        brw.flush();
        brw.close();
    }


    BufferedReader readFile(File f) {

        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            isr = new InputStreamReader(new FileInputStream(f));
            br = new BufferedReader(isr);


        } catch (Exception E) {
            return null;
        } finally {
            try {
            } catch (Exception E) {
                return null;
            }
        }
        return br;

    }

    void writeFile() {

    }
}
