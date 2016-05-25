package resources;


import com.github.genium_framework.appium.support.server.AppiumServer;
import com.sun.org.apache.bcel.internal.generic.INEG;
import com.sun.org.apache.xpath.internal.SourceTree;
import libraries.mobile.AppiumServerBuilder;
import libraries.utility.ExcelUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;

/**
 * Created by User on 5/18/2016.
 */
public class Excel2 {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        String filenamexlsx = "v2010.xlsx";
        String filenamexls = "v2003.xls";
        String newfilename = "newsavefile";
        String colname = "Username";
        String celVal;
        List<String> cellVals;

        // @TEST
        ExcelUtils.open(filenamexls);
        ExcelUtils.getSheet("testdata");

        int i = ExcelUtils.convertColNametoIndexWithBlackBefore("Action",20);
        System.out.println(i);



    }
}
