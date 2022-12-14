/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import conexaoDB.ClienteDB;
import conexaoDB.FuncionarioDB;
import entidades.Cliente;
import entidades.Funcionario;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luanf
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    public ClienteView() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        buscarFiltro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cadastrarCliente = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        txtNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alterarCliente = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        apagaCampos = new javax.swing.JButton();
        excluirCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtFiltro = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("CPF");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        buscarFiltro.setText("Buscar");
        buscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFiltroActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nome", " " }));

        jLabel5.setText("Telefone");

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Cpf", "Nascimento", "Telefone", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCliente);

        jLabel6.setText("Endereco");

        jLabel7.setText("Data de nascimento");

        alterarCliente.setText("Alterar");
        alterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarClienteActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel8.setText("Id");

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        apagaCampos.setText("Apagar Campos");
        apagaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagaCamposActionPerformed(evt);
            }
        });

        excluirCliente.setText("Excluir");
        excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNascimento))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addComponent(apagaCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarFiltro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apagaCampos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarCliente)
                    .addComponent(alterarCliente)
                    .addComponent(excluirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFiltro)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void buscarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFiltroActionPerformed
        // TODO add your handling code here:

        
         if (txtFiltro.getText().length() > 0) {
        listarValoresFiltro();
        }else{
            listarValores();
        }
        
    }//GEN-LAST:event_buscarFiltroActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        
        cadastrarCliente();
        listarValores();
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        // TODO add your handling code here:
        
        CarregarCliente();

        

    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void alterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarClienteActionPerformed
        // TODO add your handling code here:
        
        AlterarCliente();
        listarValores();

        
    }//GEN-LAST:event_alterarClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void apagaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaCamposActionPerformed
        // TODO add your handling code here:
        
        
        apagaCampos();

        
    }//GEN-LAST:event_apagaCamposActionPerformed

    private void excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteActionPerformed
        // TODO add your handling code here:
        
        deletarCliente();
        listarValores();

       
    }//GEN-LAST:event_excluirClienteActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        
         new PrincipalView().setVisible(true);
         dispose();
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton alterarCliente;
    private javax.swing.JButton apagaCampos;
    private javax.swing.JButton buscarFiltro;
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton excluirCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables


    private void cadastrarCliente(){
        
          String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();
        Date data = Date.valueOf(txtNascimento.getText());
        String telefone = txtTelefone.getText();
        String endereco = txtEndereco.getText();

        Cliente cliente = new Cliente(cpf, nome, data, email, telefone, endereco);

        ClienteDB mysql = new ClienteDB();

        try {
            mysql.insertCliente(cliente);
        } catch (Exception ex) {
            System.out.println("erro no view para inserir cliente");
            throw new RuntimeException(ex);
        }
        
    }
    
    private void listarValores() {

        try {
            ClienteDB cliente = new ClienteDB();
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

           

           

            ArrayList<Cliente> resultado = (ArrayList<Cliente>) cliente.selectCliente();

            for (int num = 0; num < resultado.size(); num++) {

                model.addRow(new Object[] {

                        resultado.get(num).getIdCliente(),
                        resultado.get(num).getNomeCliente(),
                        resultado.get(num).getEmailCliente(),
                        resultado.get(num).getCpfCliente(),
                        resultado.get(num).getNascimentoCliente(),
                        resultado.get(num).getTelefoneCliente(),
                        resultado.get(num).getEnderecoCliente()
                });
            }

        } catch (Exception e) {
            System.out.println("erro");
            throw new RuntimeException(e);

        }
    }
    
    private void listarValoresFiltro() {

        try {
            ClienteDB cliente = new ClienteDB();
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

            String filtro = null;
            
            int valorCombo = combo.getSelectedIndex();
            
            if(valorCombo == 0 ){
                
                filtro = "Where idCliente = "+txtFiltro.getText();
            }else{
                
                filtro = "Where nomeCliente LIKE '%"+txtFiltro.getText()+"%'";
            }

           

            ArrayList<Cliente> resultado = (ArrayList<Cliente>) cliente.selectCliente(filtro);

            for (int num = 0; num < resultado.size(); num++) {

                model.addRow(new Object[] {

                        resultado.get(num).getIdCliente(),
                        resultado.get(num).getNomeCliente(),
                        resultado.get(num).getEmailCliente(),
                        resultado.get(num).getCpfCliente(),
                        resultado.get(num).getNascimentoCliente(),
                        resultado.get(num).getTelefoneCliente(),
                        resultado.get(num).getEnderecoCliente()
                });
            }

        } catch (Exception e) {
            System.out.println("erro");
            throw new RuntimeException(e);

        }
    }
    
     private void CarregarCliente() {

        int setar = tabelaCliente.getSelectedRow();

        txtId.setText(tabelaCliente.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaCliente.getModel().getValueAt(setar, 1).toString());
        txtEmail.setText(tabelaCliente.getModel().getValueAt(setar, 2).toString());
        txtCPF.setText(tabelaCliente.getModel().getValueAt(setar, 3).toString());
        txtNascimento.setText(tabelaCliente.getModel().getValueAt(setar, 4).toString());
        txtTelefone.setText(tabelaCliente.getModel().getValueAt(setar, 5).toString());
        txtEndereco.setText(tabelaCliente.getModel().getValueAt(setar, 6).toString());

    }
     
     private void deletarCliente() {

       

        int id = Integer.parseInt(txtId.getText());

       Cliente cliente = new Cliente(id);

        ClienteDB mysql = new ClienteDB();

        try {
            mysql.deleteCliente(id);
        } catch (Exception ex) {
            System.out.println("erro no view para excluir cliente");
            throw new RuntimeException(ex);
        }

    }
     
     
      private void apagaCampos(){
      
      txtId.setText("");
      txtNome.setText("");
     txtEmail.setText("");
        txtCPF.setText("");
        txtNascimento.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
      
  }
      
      
      private void AlterarCliente() {

           String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();
        Date data = Date.valueOf(txtNascimento.getText());
        String telefone = txtTelefone.getText();
        String endereco = txtEndereco.getText();
        int id = Integer.parseInt(txtId.getText());
        
        Cliente cliente = new Cliente(id, nome, cpf, data, email, telefone, endereco);

      

        ClienteDB mysql = new ClienteDB();

        try {
            mysql.updateCliente(cliente);
        } catch (Exception ex) {
            System.out.println("erro no view para alterar cliente");
            throw new RuntimeException(ex);
        }

    }


}
