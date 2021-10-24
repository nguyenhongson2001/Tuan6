public class Player {
    private String ten_tai_khoan;
    private int tuoi;

    public Player() {

    }

    public Player(String ten_tai_khoan, int tuoi) {
        this.ten_tai_khoan = ten_tai_khoan;
        this.tuoi = tuoi;
    }

    public String getTen_tai_khoan() {
        return ten_tai_khoan;
    }

    public void setTen_tai_khoan(String ten_tai_khoan) {
        this.ten_tai_khoan = ten_tai_khoan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}

