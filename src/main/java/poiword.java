import org.apache.poi.POIXMLProperties;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhengfawei
 * @create 2019-08-12 下午3:29
 * @desc
 **/
public class poiword {
    public static void main(String[] args) throws Exception{
//        InputStream fis = new FileInputStream("/Users/zhengfawei/Desktop/temp/opt/nsoc/zhejiang/ratingObjectRecord/safetyChangeReport/generate/a s地方-整改报告-1565349765376.doc");
        InputStream fis = new FileInputStream("/Users/zhengfawei/Downloads/1.doc");
//        POIXMLProperties.CoreProperties coreProps = extractor.getCoreProperties();
//        printCoreProperties(coreProps);

        HWPFDocument doc = new HWPFDocument(fis);
        Range range = doc.getRange();
        String result="";
        result += range.text();
        fis.close();

    }
    /**
     * 输出CoreProperties信息
     * @param coreProps
     */
    public static void printCoreProperties(POIXMLProperties.CoreProperties coreProps) {
        System.out.println(coreProps.getCategory());   //分类
        System.out.println(coreProps.getCreator()); //创建者
        System.out.println(coreProps.getCreated()); //创建时间
        System.out.println(coreProps.getTitle());   //标题
    }

    /**
     * 关闭输入流
     * @param is
     */
    public static void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
