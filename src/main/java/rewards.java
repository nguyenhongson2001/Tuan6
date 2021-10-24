public class rewards {
    private static final int giai_db = 50000000;     //giai dac biet
    private static final int giai_kk = 100000;      //giai khuyen khich
    private static final String so_phien_quay = "123456";
    private Player player;
    private String so_da_chon;

    public rewards() {

    }

    public rewards(Player player, String so_da_chon) {
        this.player = player;
        this.so_da_chon = so_da_chon;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getSo_da_chon() {
        return so_da_chon;
    }

    public void setSo_da_chon(String so_da_chon) {
        this.so_da_chon = so_da_chon;
    }

    public boolean check_age() {
        if (player.getTuoi() >= 18 && player.getTuoi() <= 25) {
            return true;
        }
        return false;
    }

    public static boolean isNumeric(String so_da_chon) {
        try {
            Double.parseDouble(so_da_chon);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public int check_ki_tu() {
        if (so_da_chon.equals(so_phien_quay)) {
            return 1;
        }
        if(so_da_chon.substring(4).equals(so_phien_quay.substring(4))) {
            return 2;
        }
        return 3;
    }

    public boolean check_number() {
        if (so_da_chon.length() == 6 && isNumeric(so_da_chon)) {
            return true;
        }
        return false;
    }

    public String giai_thuong() {
        if (!check_age()) {
            return "Ban khong du tuoi de tham gia tro choi";
        }
        if (check_number()) {
            if (check_ki_tu() == 1) {
                return "Ban da nhan duoc giai dac biet voi giai thuong la " + giai_db;
            } else if (check_ki_tu() == 2) {
                return "Ban da nhan duoc giai khuyen khich voi giai thuong la " + giai_kk;
            }
        } else {
            return "So ban chon khong hop le!";
        }
        return "Chuc ban may man lan sau!";
    }
}

