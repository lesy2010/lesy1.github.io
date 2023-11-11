package BaiLam;
import java.util.Scanner;

public class SoPhuc implements PhepCong {
	int phanthuc;
	int phanao;
	
	
	public SoPhuc() {
		super();
	}
	public SoPhuc(int phanthuc, int phanao) {
		super();
		this.phanthuc = phanthuc;
		this.phanao = phanao;
	}
	void nhap()
	{
		Scanner sc = new Scanner(System.in);
		this.phanthuc = sc.nextInt();
		this.phanao = sc.nextInt();
	}
	@Override
	public Object add(Object o) {
		// TODO Auto-generated method stub
		SoPhuc kq = new SoPhuc();
		SoPhuc sp = (SoPhuc) o;
		kq.phanthuc = this.phanthuc + sp.phanthuc;
		kq.phanao = this.phanao + sp.phanao;
		return kq;
	}
	void hienThi() {
		if(phanao>=0)
        System.out.print(phanthuc + "+" + phanao + "i ");
		else System.out.print(phanthuc +"-"+ phanao*-1 + "i ");
    }
}
