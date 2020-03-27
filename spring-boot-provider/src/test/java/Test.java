import com.example.util.CollectionUtil;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author tuzhijin
 * @version Id: Test.java, v 0.1 2019/6/3 7:32 tuzhijin Exp $$
 */
public class Test {

    public static void main(String[] args) {
//        getDiffers();
//        String str = "D:\\360安全浏览器下载\\错误的行为.docx";
//        String[] split = str.split("\\\\");
//        System.out.println(split[split.length-1]);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.toString());
    }

    private static void getDiffers() {
        List<String> list1 = new LinkedList<String>();
        List<String> list2 = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            list1.add("test" + i);
            list2.add("test" + i * 2);
        }
        Collection diffentNoDuplicate = CollectionUtil.getDiffentNoDuplicate(list1,list2);
        System.out.println(diffentNoDuplicate.size());
    }
}
