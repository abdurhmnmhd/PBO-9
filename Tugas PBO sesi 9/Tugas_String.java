public class Tugas_String {
    public static void main(String[] args) {
        String nama1 = "Muhamad Abdurahman";
        String nama2 = "Muhamad Abdurahman";
        String nama3 = "Muhamad Abdurahman";

        System.out.println("=========================");
        System.out.println("Hasil dari Method Lenght : " + nama1.length());

        System.out.println("=========================");
        System.out.println("Hasil dari Method Substring : " + nama1.substring(0, 8));

        System.out.println("=========================");
        System.out.println("Hasil dari Method ChartAt : " + nama1.charAt(13));

        System.out.println("=========================");
        System.out.println("Hasil dari Method toLowerCase : " + nama1.toLowerCase());

        System.out.println("=========================");
        System.out.println("Hasil dari Method toUpper : " + nama1.toUpperCase());

        System.out.println("=========================");
        System.out.println("Hasil dari Method Replace : " + nama1.replace("Abdu", "ahmad"));

        System.out.println("=========================");
        System.out.println("Hasil dari Method Contains : " + nama1.contains("Muhamad"));

        System.out.println("=========================");
        System.out.println("Hasil dari Method Equals : " + nama1.equals(nama2));
        System.out.println("Hasil dari Method Equals : " + nama1.equals(nama3));

        System.out.println("=========================");
        System.out.println("Hasil dari Method EqualsIgnorCase : " + nama1.equalsIgnoreCase(nama2)); 
        System.out.println("Hasil dari Method EqualsIgnorCase : " + nama1.equalsIgnoreCase(nama3)); 


        System.out.println("=========================");
        System.out.println("Hasil dari Method EndsWith : " + nama1.endsWith("m"));
    }
}