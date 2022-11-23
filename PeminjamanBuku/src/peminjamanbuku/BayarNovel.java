/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peminjamanbuku;

/**
 *
 * @author acer
 */
public class BayarNovel extends javax.swing.JFrame {
        static Novel novel;
    /**
     * Creates new form BayarNovel
     */
    public BayarNovel(Novel novel) {
        initComponents();
        juduln.setText("Judul : " + novel.getJudul());
        authorn.setText("Author : " + novel.getAuthor());
        penerbitn.setText("Penerbit : " + novel.getPenerbit());
        genren.setText("Genre : " + novel.getGenre());
        halamann.setText(String.valueOf("Halaman :" + novel.getHalaman()));
        stokn.setText(String.valueOf("Stok :" + novel.getStok()));
        hargan.setText(String.valueOf("Harga :" + novel.getHarga()));
        hargaperharin.setText(String.valueOf("Harga/Hari :" + novel.getHargaPerHari()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        juduln = new javax.swing.JLabel();
        authorn = new javax.swing.JLabel();
        penerbitn = new javax.swing.JLabel();
        genren = new javax.swing.JLabel();
        halamann = new javax.swing.JLabel();
        stokn = new javax.swing.JLabel();
        hargaperharin = new javax.swing.JLabel();
        hargan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 0, 150, 30);

        juduln.setText("Judul");
        getContentPane().add(juduln);
        juduln.setBounds(6, 48, 250, 14);

        authorn.setText("Author");
        getContentPane().add(authorn);
        authorn.setBounds(6, 76, 250, 14);

        penerbitn.setText("Penerbit");
        getContentPane().add(penerbitn);
        penerbitn.setBounds(6, 104, 250, 14);

        genren.setText("Genre");
        getContentPane().add(genren);
        genren.setBounds(6, 132, 250, 14);

        halamann.setText("Halaman");
        getContentPane().add(halamann);
        halamann.setBounds(6, 160, 250, 14);

        stokn.setText("Stok");
        getContentPane().add(stokn);
        stokn.setBounds(6, 188, 250, 14);

        hargaperharin.setText("Harga/Hari");
        getContentPane().add(hargaperharin);
        hargaperharin.setBounds(6, 244, 250, 14);

        hargan.setText("Harga");
        getContentPane().add(hargan);
        hargan.setBounds(6, 216, 250, 14);

        jLabel2.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BayarNovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BayarNovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BayarNovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BayarNovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BayarNovel(novel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorn;
    private javax.swing.JLabel genren;
    private javax.swing.JLabel halamann;
    private javax.swing.JLabel hargan;
    private javax.swing.JLabel hargaperharin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel juduln;
    private javax.swing.JLabel penerbitn;
    private javax.swing.JLabel stokn;
    // End of variables declaration//GEN-END:variables
}
