
package table;

import model.Produto;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ProdutoTableModel extends AbstractTableModel {

    public static final int COL_CODIGO_PRODUTO = 0;
    public static final int COL_NOME_PRODUTO = 1;
    public static final int COL_PRECO_PRODUTO = 2;
    public ArrayList<Produto> lista;

    public ProdutoTableModel(ArrayList<Produto> l) {
        lista = new ArrayList<Produto>(l);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Produto produto = lista.get(linhas);
        
        if(colunas == COL_CODIGO_PRODUTO) return produto.getId();
        if(colunas == COL_NOME_PRODUTO) return produto.getNome();
        if(colunas == COL_PRECO_PRODUTO) return produto.getPreco();
        return "";
        
    }

    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_CODIGO_PRODUTO) return "Código";
        if(colunas == COL_NOME_PRODUTO) return "Nome";
        if(colunas == COL_PRECO_PRODUTO) return "Preço";
        return "";
    }
    
}
