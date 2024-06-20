package ss11.bai_tap.dem_so_lan_xuat_hien_bang_map;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "	Giờ thì anh đã can đảm để nhìn em mỉm cười	"+
                "	Và cám ơn em ngày qua	"+
                "	Dù điều này làm anh đau hơn cả tới thiên đường hoh huh	"+
                "	Nếu tự nhìn lại quãng thời gian qua	"+
                "	Đã có lúc nước mắt anh nuốt ngược vào trong	"+
                "	Cay đắng	"+
                "	Tự mình trách vì không trói được tiếng yêu	"+
                "	Vì anh muốn quan tâm em bằng tất cả những yêu thương bao năm anh có được	"+
                "	Mà sao mắt môi em vẫn chưa khi nào bằng lòng	"+
                "	Giờ thì anh đã can đảm để rời xa em rồi	"+
                "	Đừng khóc nhé em người ơi	"+
                "	Dù rằng đường mình chung đôi anh từng ngỡ sẽ dài	"+
                "	Người ta yêu nào đâu cứ phải bên nhau đến cùng	"+
                "	Giờ thì anh đã can đảm để nhìn em mỉm cười	"+
                "	Và cám ơn em ngày qua	"+
                "	Dù điều này làm anh đau hơn cả tới thiên đường hoh huh	"+
                "	Sẽ còn mình anh với nỗi bất an	"+
                "	Sẽ chẳng biết phải khóc hay cười những khi nhớ em	"+
                "	Rồi lo lắng ổn không nếu em thiếu anh	"+
                "	Ngủ ngoan nhé em thân yêu của anh	"+
                "	Đừng bắt màn đêm len vào đôi mắt tròn	"+
                "	Vào buổi sáng hôm sau bình yên như chưa yêu nhau	"+
                "	Giờ thì anh đã can đảm để rời xa em rồi	"+
                "	Đừng khóc nhé em người ơi	"+
                "	Dù rằng đường mình chung đôi anh từng ngỡ sẽ dài	"+
                "	Người ta yêu nào đâu cứ phải bên nhau đến cùng	"+
                "	Giờ thì anh đã can đảm để nhìn em mỉm cười	"+
                "	Và cám ơn em ngày qua	"+
                "	Dù điều này làm anh đau hơn cả tới thiên đường hoh huh	";
        TreeMap<String, Integer> wordCounter = new TreeMap<>();
        text = text.replace(",","")
                .replace(".","")
                .replace(";","")
                .replace("\t"," ");
        String[] words = text.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                String lowercaseWord = word.toLowerCase();
                if (wordCounter.containsKey(lowercaseWord)) {
                    wordCounter.put(lowercaseWord, wordCounter.get(lowercaseWord) + 1);
                } else {
                    wordCounter.put(lowercaseWord, 1);
                }
            }
        }
        System.out.println("Word Counts (alphabetical order):");
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}




