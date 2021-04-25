package Tugas_W07;

/**
 *
 * @author Anton
 */
public class User {
    public static void main(String[] args) {
        TVModern user = new TVModern("TV Sharp, 29 inch", 10);
        String[] channels = {
            "RCTI", "TRANS TV", "SCTV", "NET TV", "DISCOVERY", "GTV", "HBO",
            "TRANS 7", "INEWS", "FOX MOVIES"
        };   
        System.out.println("Pak Lukman membeli televisi : " + user.deskripsi);
        
        user.getChannel();
        user.setChannels(channels);
        user.setChannelAktif(5);
        user.setChannelAktif(2);
        user.setVolume(25);
        user.setChannelAktif(6);
        
        user.setModusTampilan(TVModern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(032);
        user.setModusTampilan(TVModern.TV);
        user.getModusTampilan();
        
        user.playCD();
        user.setDiscTray("Avenger - End Game");
        user.playCD();
    }
}
