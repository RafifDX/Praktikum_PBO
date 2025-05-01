
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tripod> daftarTripod = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static int idCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MyTripod Management ===");
            System.out.println("1. Tambah Tripod");
            System.out.println("2. Lihat Semua Tripod");
            System.out.println("3. Edit Tripod");
            System.out.println("4. Hapus Tripod");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();
            input.nextLine();  // Membersihkan input buffer

            switch (pilihan) {
                case 1:
                    tambahTripod();
                    break;
                case 2:
                    tampilkanTripod();
                    break;
                case 3:
                    editTripod();
                    break;
                case 4:
                    hapusTripod();
                    break;
                case 5:
                    System.out.println("Keluar dari program");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahTripod() {
        System.out.println("Pilih jenis tripod:");
        System.out.println("1. Travel Tripod");
        System.out.println("2. Vlog Tripod");
        System.out.print("Pilihan: ");
        int pilihanJenis = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan merk tripod: ");
        String merk = input.nextLine();
        System.out.print("Masukkan harga sewa: ");
        double harga = input.nextDouble();
        input.nextLine();

        if (pilihanJenis == 1) {
            System.out.print("Masukkan ukuran terlipat (cm): ");
            double foldedSize = input.nextDouble();
            TravelTripod travelTripod = new TravelTripod(idCounter++, merk, harga, foldedSize);
            daftarTripod.add(travelTripod);
            System.out.println("Travel Tripod berhasil ditambahkan!");
        } else if (pilihanJenis == 2) {
            System.out.print("Apakah ada grip handle? (true/false): ");
            boolean hasGripHandle = input.nextBoolean();
            VlogTripod vlogTripod = new VlogTripod(idCounter++, merk, harga, hasGripHandle);
            daftarTripod.add(vlogTripod);
            System.out.println("Vlog Tripod berhasil ditambahkan!");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private static void tampilkanTripod() {
        if (daftarTripod.isEmpty()) {
            System.out.println("Belum ada tripod yang tersedia.");
            return;
        }
        System.out.println("\n=== Daftar Tripod ===");
        for (Tripod t : daftarTripod) {
            System.out.println(t);
            System.out.println("Harga Sewa: Rp" + String.format("%,.2f", t.calculateRentalPrice()));
        }
    }

    private static void editTripod() {
        System.out.print("Masukkan ID tripod yang ingin diedit: ");
        int id = input.nextInt();
        input.nextLine();

        for (Tripod t : daftarTripod) {
            if (t.getId() == id) {
                System.out.print("Masukkan merk baru: ");
                String merkBaru = input.nextLine();
                System.out.print("Masukkan harga sewa baru: ");
                double hargaBaru = input.nextDouble();
                input.nextLine();

                t.setMerk(merkBaru);
                t.setHarga(hargaBaru);
                System.out.println("Tripod berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Tripod dengan ID tersebut tidak ditemukan.");
    }

    private static void hapusTripod() {
        System.out.print("Masukkan ID tripod yang ingin dihapus: ");
        int id = input.nextInt();
        input.nextLine();

        for (Tripod t : daftarTripod) {
            if (t.getId() == id) {
                daftarTripod.remove(t);
                System.out.println("Tripod berhasil dihapus!");
                return;
            }
        }
        System.out.println("Tripod dengan ID tersebut tidak ditemukan.");
    }
}
    