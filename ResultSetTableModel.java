package basedonnees;

import java.sql.ResultSet;
import javax.swing.table.AbstractTableModel;
public class ResultSetTableModel extends AbstractTableModel{
    private ResultSet rs;
    public ResultSetTableModel(ResultSet rs){
        this.rs=rs;
        fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        try {
            if(rs==null){
                return 0;
            }else{
                rs.last();
                return rs.getRow();
            }
        } catch (Exception e) {
            System.out.println("getcolumncount resultset error wile getting");
            System.out.println(e.getMessage());
            return 0;
        } 
    }

    @Override
    public int getColumnCount() {
        try {
            if(rs==null){
                return 0;
            }else{
                return rs.getMetaData().getColumnCount();
            }
        } catch (Exception e) {
            System.out.println("getcolumncount resultset error wile getting");
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex<0 || rowIndex>getRowCount() || columnIndex<0 || columnIndex>getColumnCount()){
            return null;
        }
        try {
            if(rs == null){
                return null;
            }else{
                rs.absolute(rowIndex + 1);
                return rs.getObject(columnIndex + 1);
            }
        } catch (Exception e) {
            System.out.println("getcolumncount resultset error wile getting");
            System.out.println(e.getMessage());
            return null;
        }
    }
    @Override
    public String getColumnName(int columnIndex){
        try {
            return rs.getMetaData().getColumnName(columnIndex + 1);
        } catch (Exception e) {
            System.out.println("getcolumncount resultset error wile getting");
            System.out.println(e.getMessage());
        }
        return super.getColumnName(columnIndex);
    }
}


