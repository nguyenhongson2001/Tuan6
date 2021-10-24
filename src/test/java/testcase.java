import org.junit.Assert;
import org.junit.Test;

public class testcase {

    @Test
    public void testReward1() {
        Player player = new Player("NguyenVanA", 18);
        rewards reward = new rewards(player, "123456");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("Ban da nhan duoc giai dac biet voi giai thuong la 50000000", giai_thuong);
    }

    @Test
    public void testReward2() {
        Player player = new Player("NguyenVanB", 15);
        rewards reward = new rewards(player, "235756");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("Ban khong du tuoi de tham gia tro choi", giai_thuong);
    }

    @Test
    public void testReward3() {
        Player player = new Player("NguyenVanC", 26);
        rewards reward = new rewards(player, "214567");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("Ban khong du tuoi de tham gia tro choi", giai_thuong);
    }

    @Test
    public void testReward4() {
        Player player = new Player("NguyenVanD", 25);
        rewards reward = new rewards(player, "123356");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("Ban da nhan duoc giai khuyen khich voi giai thuong la 100000", giai_thuong);
    }

    @Test
    public void testReward5() {
        Player player = new Player("NguyenVanE", 20);
        rewards reward = new rewards(player, "7123566");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("So ban chon khong hop le!", giai_thuong);
    }

    @Test
    public void testReward6() {
        Player player = new Player("NguyenVanF", 21);
        rewards reward = new rewards(player, "ab3@56");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("So ban chon khong hop le!", giai_thuong);
    }

    @Test
    public void testReward7() {
        Player player = new Player("NguyenVanG", 22);
        rewards reward = new rewards(player, "653421");
        String giai_thuong = reward.giai_thuong();
        Assert.assertEquals("Chuc ban may man lan sau!", giai_thuong);
    }
}
