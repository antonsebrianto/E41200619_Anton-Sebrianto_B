package Tugas_W07;

/**
 *
 * @author Anton
 */
public class TV {
    String deskripsi = "";
    int jumlahChannel = 0;
    String [] channels = new String[jumlahChannel];
    int channelAktif = 0;
    int volume = 0;
    
    TV ( final String deskripsi, final int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    public void getDeskripsi(){
        System.out.println("Pak Harjo membeli " + deskripsi);
    }
    public void setChannels(String[] channels){
        if (channels.length > this.jumlahChannel){
            System.out.println("Maaf TV ini hanya dapat menampung " + this.jumlahChannel + " channels");
        }
        else{
            this.channels = channels;
            System.out.println("Informasi channels berhasil diupdate!");
        }
    }
    public void getChannel(){
        if (this.channels.length == 0){
            System.out.println("Channel yang Anda inginkan belum diset");
        }
        else {
            String data = "";
            for (String channel : this.channels){
                data += channel + " "; 
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    public void setChannelAktif(int e){
        this.channelAktif = e;
        int data = e;
        System.out.println("Pindah channels ke : " + this.channels[e-1]);
    }
    public void setVolume(int v){
        System.out.println("Intensitas volume sekarang : " + v );
    }
}