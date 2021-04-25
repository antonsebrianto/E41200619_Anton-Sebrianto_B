package Tugas_W07;

/**
 *
 * @author Anton
 */
public class TVModern extends TV {
    public TVModern(String deskripsi, int jumlahChannel){
        super (deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    public void setModusTampilan(String t){
        TVModern.TELETEXT = t;
    }
    public void getModusTampilan(){
        System.out.println("Modus Tampilan : " + TELETEXT);
    }
    public void setHalamanTeletext(int h){
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    String cd = "";
    public void setDiscTray(String e){
        this.cd = e;
    }
    public void playCD(){
        if (cd.equals("")){
            System.out.println("Tidak ada CD di dalam disc tray!");
        }
        else {
            System.out.println("Memutar film " + cd);
        }
    }
}
