package BaiLam;

import java.util.Scanner;

public class SoThuc implements PhepCong {
    float giaTri;

    public SoThuc() {
        super();
    }

    public SoThuc(float giaTri) {
        super();
        this.giaTri = giaTri;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        this.giaTri = sc.nextFloat();
    }

    @Override
    public Object add(Object o) {
        SoThuc kq = new SoThuc();
        SoThuc st = (SoThuc) o;
        kq.giaTri = this.giaTri + st.giaTri;
        return kq;
    }

    void hienThi() {
        System.out.print(giaTri + " ");
    }
}