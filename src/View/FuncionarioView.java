/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import conexaoDB.FuncionarioDB;
import conexaoDB.ProdutoDB;
import entidades.Funcionario;
import entidades.Produto;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luanf
 */
public class FuncionarioView extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioView
     */
    public FuncionarioView() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        cadastrarFuncionario = new javax.swing.JButton();
        txtNascimento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        alterarFuncionario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        apagaCampos = new javax.swing.JButton();
        excluirFuncionario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        buscarFiltro = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Email");

        jLabel4.setText("Salario");

        jLabel5.setText("Telefone");

        jLabel6.setText("Endereco");

        jLabel7.setText("Data de nascimento");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        cadastrarFuncionario.setText("Cadastrar");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Cpf", "Nascimento", "Salario", "Telefone", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaFuncionario);

        alterarFuncionario.setText("Alterar");
        alterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFuncionarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Id");

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

        excluirFuncionario.setText("Excluir");
        excluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirFuncionarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Inserir id ");

        buscarFiltro.setText("Buscar");
        buscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFiltroActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nome", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNascimento))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrarFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alterarFuncionario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluirFuncionario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(153, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagaCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFuncionario)
                    .addComponent(alterarFuncionario)
                    .addComponent(excluirFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFiltro)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFuncionarioActionPerformed
        // TODO add your handling code here:
        
        AlterarFuncionario();
        listarValores();
    }//GEN-LAST:event_alterarFuncionarioActionPerformed

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        // TODO add your handling code here:
        
        CarregarFuncionario();
        listarValores();
        
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void apagaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagaCamposActionPerformed
        // TODO add your handling code here:
        
        
        apagaCampos();
    }//GEN-LAST:event_apagaCamposActionPerformed

    private void excluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirFuncionarioActionPerformed
        // TODO add your handling code here:
        
        deletarFuncionario();
        listarValores();
    }//GEN-LAST:event_excluirFuncionarioActionPerformed

    private void buscarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFiltroActionPerformed
        // TODO add your handling code here:
        
         if (txtFiltro.getText().length() > 0) {
        listarValoresFiltro();
        }else{
            listarValores();
        }
    }//GEN-LAST:event_buscarFiltroActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCPFActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtEnderecoActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
      cadastrarFuncionario();
      listarValores();

    }// GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void consultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_consultarFuncionarioActionPerformed
        // TODO add your handling code here:

        listarValores();
    }// GEN-LAST:event_consultarFuncionarioActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarFuncionario;
    private javax.swing.JButton apagaCampos;
    private javax.swing.JButton buscarFiltro;
    private javax.swing.JButton cadastrarFuncionario;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton excluirFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {

        try {
            FuncionarioDB funcionario = new FuncionarioDB();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);

            String filtro;

           

            ArrayList<Funcionario> resultado = (ArrayList<Funcionario>) funcionario.selectFuncionario();

            for (int num = 0; num < resultado.size(); num++) {

                model.addRow(new Object[] {

                        resultado.get(num).getIdFuncionario(),
                        resultado.get(num).getNomeFuncionario(),
                        resultado.get(num).getEmailFuncionario(),
                        resultado.get(num).getCpfFuncionario(),
                        resultado.get(num).getNascimentoFuncionario(),
                        resultado.get(num).getSalarioFuncionario(),
                        resultado.get(num).getTelefoneFuncionario(),
                        resultado.get(num).getEnderecoFuncionario()
                });
            }

        } catch (Exception e) {
            System.out.println("erro");
            throw new RuntimeException(e);

        }
    }
    
    private void listarValoresFiltro() {

        try {
            FuncionarioDB funcionario = new FuncionarioDB();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);

            String filtro = null;
            
            int valorCombo = combo.getSelectedIndex();
            
            if(valorCombo == 0 ){
                
                filtro = "Where idFuncionario = "+txtFiltro.getText();
            }else{
                
                filtro = "Where nomeFuncionario LIKE '%"+txtFiltro.getText()+"%'";
            }

           

            ArrayList<Funcionario> resultado = (ArrayList<Funcionario>) funcionario.selectFuncionario(filtro);

            for (int num = 0; num < resultado.size(); num++) {

                model.addRow(new Object[] {

                        resultado.get(num).getIdFuncionario(),
                        resultado.get(num).getNomeFuncionario(),
                        resultado.get(num).getEmailFuncionario(),
                        resultado.get(num).getCpfFuncionario(),
                        resultado.get(num).getNascimentoFuncionario(),
                        resultado.get(num).getSalarioFuncionario(),
                        resultado.get(num).getTelefoneFuncionario(),
                        resultado.get(num).getEnderecoFuncionario()
                });
            }

        } catch (Exception e) {
            System.out.println("erro");
            throw new RuntimeException(e);

        }
    }

    
    private void cadastrarFuncionario(){
        
          String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();
        Float salario = Float.parseFloat(txtSalario.getText());
        Date data = Date.valueOf(txtNascimento.getText());
        String telefone = txtTelefone.getText();
        String endereco = txtEndereco.getText();

        Funcionario funcionario = new Funcionario(nome, cpf, data, email, salario, telefone, endereco);

        FuncionarioDB mysql = new FuncionarioDB();

        try {
            mysql.insertFuncionario(funcionario);
        } catch (Exception ex) {
            System.out.println("erro no view para inserir funcionario");
            throw new RuntimeException(ex);
        }
        
    }
    
    private void AlterarFuncionario() {

           String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();
        Float salario = Float.parseFloat(txtSalario.getText());
        Date data = Date.valueOf(txtNascimento.getText());
        String telefone = txtTelefone.getText();
        String endereco = txtEndereco.getText();
        int id = Integer.parseInt(txtId.getText());
        
        Funcionario funcionario = new Funcionario(id,nome, cpf, data, email, salario, telefone, endereco);

      

        FuncionarioDB mysql = new FuncionarioDB();

        try {
            mysql.updateFuncionario(funcionario);
        } catch (Exception ex) {
            System.out.println("erro no view para alterar funcionario");
            throw new RuntimeException(ex);
        }

    }
    
    
     private void CarregarFuncionario() {

        int setar = tabelaFuncionario.getSelectedRow();

        txtId.setText(tabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        txtEmail.setText(tabelaFuncionario.getModel().getValueAt(setar, 2).toString());
        txtCPF.setText(tabelaFuncionario.getModel().getValueAt(setar, 3).toString());
        txtNascimento.setText(tabelaFuncionario.getModel().getValueAt(setar, 4).toString());
        txtSalario.setText(tabelaFuncionario.getModel().getValueAt(setar, 5).toString());
        txtTelefone.setText(tabelaFuncionario.getModel().getValueAt(setar, 6).toString());
        txtEndereco.setText(tabelaFuncionario.getModel().getValueAt(setar, 7).toString());

    }
     
      public void apagaCampos(){
      
      txtId.setText("");
      txtNome.setText("");
     txtEmail.setText("");
        txtCPF.setText("");
        txtNascimento.setText("");
        txtSalario.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
      
  }
      
      
       private void deletarFuncionario() {

        int id;

        id = Integer.parseInt(txtId.getText());

       Funcionario funcionario = new Funcionario(id);

        FuncionarioDB mysql = new FuncionarioDB();

        try {
            mysql.deleteFuncionario(funcionario);
        } catch (Exception ex) {
            System.out.println("erro no view para excluir produto");
            throw new RuntimeException(ex);
        }

    }
}
