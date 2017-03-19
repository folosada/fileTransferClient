package br.furb.client;


import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        this.rbGoogleDrive.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupServer = new javax.swing.ButtonGroup();
        btnSelecionarArquivo = new javax.swing.JButton();
        panelServer = new javax.swing.JPanel();
        rbGoogleDrive = new javax.swing.JRadioButton();
        rbDropbox = new javax.swing.JRadioButton();
        rbOneDrive = new javax.swing.JRadioButton();
        lblArquivoSelecionado = new javax.swing.JLabel();
        lblArquivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSelecionarArquivo.setText("Selecionar");
        btnSelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarArquivoActionPerformed(evt);
            }
        });

        panelServer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Server", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N

        btnGroupServer.add(rbGoogleDrive);
        rbGoogleDrive.setText("GoogleDrive");
        rbGoogleDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGoogleDriveActionPerformed(evt);
            }
        });

        btnGroupServer.add(rbDropbox);
        rbDropbox.setText("Dropbox");
        rbDropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDropboxActionPerformed(evt);
            }
        });

        btnGroupServer.add(rbOneDrive);
        rbOneDrive.setText("OneDrive");
        rbOneDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOneDriveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelServerLayout = new javax.swing.GroupLayout(panelServer);
        panelServer.setLayout(panelServerLayout);
        panelServerLayout.setHorizontalGroup(
            panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbGoogleDrive)
                    .addComponent(rbDropbox)
                    .addComponent(rbOneDrive))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelServerLayout.setVerticalGroup(
            panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServerLayout.createSequentialGroup()
                .addComponent(rbGoogleDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOneDrive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbDropbox)
                .addContainerGap())
        );

        lblArquivoSelecionado.setText("Arquivo Selecionado: ");

        lblArquivo.setText("Nenhum");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArquivoSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btnSelecionarArquivo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarArquivo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArquivoSelecionado)
                            .addComponent(lblArquivo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelServer.getAccessibleContext().setAccessibleName("panel_server");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarArquivoActionPerformed
        File file = openFile();
        try {
            sendMessageMulticast(file.getName());
            Address serverAddress = receiveServerAddress();
            sendFileSocket(serverAddress, file);
            JOptionPane.showMessageDialog(this, "Envio concluído", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro no envio do arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarArquivoActionPerformed

    private void rbGoogleDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGoogleDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGoogleDriveActionPerformed

    private void rbDropboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDropboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDropboxActionPerformed

    private void rbOneDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOneDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOneDriveActionPerformed

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
    public void sendMessageMulticast(String fileName) throws IOException {
        byte[] sendData = new byte[1024];
        byte ttl = (byte) 10;

        int porta = 5000;
        MulticastSocket clientSocket = new MulticastSocket();
        InetAddress endereco = InetAddress.getByName("227.55.77.99");
        clientSocket.joinGroup(endereco);
        if (fileName != null && !"".equals(fileName)) {
            sendData = ("[TEXT]" + fileName).getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, endereco, porta);
            clientSocket.setTimeToLive(ttl);
            clientSocket.send(sendPacket);            
            clientSocket.leaveGroup(endereco);
            clientSocket.close();            
        }
    }
    
    private static Address receiveServerAddress() throws Exception {
        byte[] buf = new byte[1024];
        DatagramPacket request = null;
        DatagramSocket socket = new DatagramSocket(5005);
        request = new DatagramPacket (buf, buf.length);
        String result = "";
        int attempt = 0;
        while ("".equals(result.trim()) || attempt >= 10) {
            socket.receive(request);
            result = new String(request.getData(),0,request.getLength());
            if (!"".equals(result.trim())) {
                Address address = new Address();
                result = result.substring(4);
                String[] aResult = result.split(":");
                address.setIpAddress(aResult[0]);
                address.setPortNumber(Integer.parseInt(aResult[1]));
                return address;
            }
        }            
        return null;
    }
    
    private static void sendFileSocket(Address serverAddress, File file) throws Exception {
        Socket socket;
        byte[] sendData = new byte[1024];
        if (file != null ) {
            /* Inicializacao de socket TCP */
            socket = new Socket(serverAddress.getIpAddress(), serverAddress.getPortNumber());
            
            FileInputStream in = new FileInputStream(file);
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter writer = new BufferedWriter(osw);
            writer.write(file.getName() + "\n");
            writer.flush();
            int tamanho = 4096; // buffer de 4KB  
	    byte[] buffer = new byte[tamanho];  
	    int lidos = -1;  
	    while ((lidos = in.read(buffer, 0, tamanho)) != -1) {  
	        out.write(buffer, 0, lidos);  
	    }  
            
            socket.close();
        }
    }
    
    private static File openFile() {
        JFileChooser openFile = new JFileChooser();
        openFile.setAcceptAllFileFilterUsed(false);
        openFile.setDialogType(JFileChooser.OPEN_DIALOG);
        if (openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return openFile.getSelectedFile();
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupServer;
    private javax.swing.JButton btnSelecionarArquivo;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblArquivoSelecionado;
    private javax.swing.JPanel panelServer;
    private javax.swing.JRadioButton rbDropbox;
    private javax.swing.JRadioButton rbGoogleDrive;
    private javax.swing.JRadioButton rbOneDrive;
    // End of variables declaration//GEN-END:variables
}
