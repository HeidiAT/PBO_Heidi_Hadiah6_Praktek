import java.util.Scanner;

class pln
{
	public String nama, alamat;
	public int tipe, blok, bloka, bayar;
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void setAlamat(String alamat)
	{
		this.alamat = alamat;
	}
	
	public String getAlamat()
	{
		return alamat;
	}
	
	public void setTipe(int tipe)
	{
		this.tipe = tipe;
	}
	
	public int getTipe()
	{
		return tipe;
	}
	
	public void setBlok(int blok)
	{
		this.blok = blok;
	}
	
	public int getBlok()
	{
		return blok;
	}
	
	public void setBloka(int bloka)
	{
		this.bloka = bloka;
	}
	
	public int getBloka()
	{
		return bloka;
	}
	
	public void setBayar(int bayar)
	{
		this.bayar = bayar;
	}
	
	public int getBayar()
	{
		return bayar;
	}
}

public class HadiahPrak6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		pln p = new pln();
		
		int kembalian;
		boolean loop = true;
		
		System.out.print("Masukkan Nama: ");
		p.nama = input.nextLine();
		System.out.print("Masukkan Alamat: ");
		p.alamat = input.nextLine();
		System.out.println();
		System.out.println("Tipe");
		System.out.println("1. Tipe 36");
		System.out.println("2. Tipe 37");
		System.out.print("Masukkan Tipe Pilihan: ");
		p.tipe = input.nextInt();
		System.out.println();
		
		while(loop)
		{
			switch(p.tipe)
			{
				case 1: System.out.println("Blok");
						System.out.println("1. A: Rp 500.000");
						System.out.println("2. B: Rp 300.000");
						System.out.print("Masukkan Blok yang dipilih: ");
						p.blok = input.nextInt();
						switch(p.blok)
						{
							case 1: System.out.print("Bayar: Rp ");
									p.bayar = input.nextInt();
									kembalian = p.bayar - 500000;
									System.out.println();
									System.out.println("Nama: " +p.getNama());
									System.out.println("Alamat: " +p.getAlamat());
									System.out.println("Harga yang di Bayar = Rp 500000");
									System.out.println("Bayar = Rp " +p.getBayar());
									System.out.println("Kembalian = Rp "+kembalian);
									System.out.println();
									loop = false; break;
							case 2: System.out.print("Bayar: Rp ");
									p.bayar = input.nextInt();
									kembalian = p.bayar - 300000;
									System.out.println();
									System.out.println("Nama: " +p.getNama());
									System.out.println("Alamat: " +p.getAlamat());
									System.out.println("Harga yang di Bayar = Rp 300000");
									System.out.println("Bayar = Rp " +p.getBayar());
									System.out.println("Kembalian = Rp "+kembalian);
									System.out.println();
									loop = false; break;
							default: System.out.println("Blok yang anda pilih tidak tersedia!! Silahkan pilih antara 1 dan 2!!");
						}
						loop = false; break;
				case 2: System.out.println("Blok");
						System.out.println("1. A: Rp 800.000");
						System.out.println("2. B: Rp 600.000");
						System.out.print("Masukkan Blok yang dipilih: ");
						p.blok = input.nextInt();
						switch(p.blok)
						{
							case 1: System.out.print("Bayar: Rp ");
									p.bayar = input.nextInt();
									kembalian = p.bayar - 800000;
									System.out.println();
									System.out.println("Nama: " +p.getNama());
									System.out.println("Alamat: " +p.getAlamat());
									System.out.println("Harga yang di Bayar = Rp 800000");
									System.out.println("Bayar = Rp " +p.getBayar());
									System.out.println("Kembalian = Rp "+kembalian);
									System.out.println();
									loop = false; break;
							case 2: System.out.print("Bayar: Rp ");
									p.bayar = input.nextInt();
									kembalian = p.bayar - 600000;
									System.out.println();
									System.out.println("Nama: " +p.getNama());
									System.out.println("Alamat: " +p.getAlamat());
									System.out.println("Harga yang di Bayar = Rp 600000");
									System.out.println("Bayar = Rp " +p.getBayar());
									System.out.println("Kembalian = Rp "+kembalian);
									System.out.println();
									loop = false; break;
							default: System.out.println("Blok yang anda pilih tidak tersedia!! Silahkan pilih antara 1 dan 2!!");
						}
						loop = false; break;
				default: System.out.println("Tipe yang anda pilih tidak ada!! Mohon Pilih antara 1 dan 2!!");
			}
			break;
		}
	}
}