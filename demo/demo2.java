:
import java.io.File;
import java.util.Date;

class file_01 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("muni.html");
        System.out.println(f1.createNewFile());
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());
        System.out.println(f1.exists());
        Date d = new Date();

        System.out.println((d.getTime() - f1.lastModified() / 1000) / 60);

    }

}
