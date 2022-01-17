package basedonnees;
import java.net.Socket;
import java.sql.*;
public class BD {
    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    int port;
    Socket client;
    String host;
    public BD(String url, String username,String password,String host,int port){
        this.url=url;
        this.username=username;
        this.password=password;
        this.host=host;
        this.port=port;
    }
    //fonction pour la connection a la base de donnees
    public Connection connexionDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
	    connection=DriverManager.getConnection("jdbc:mysql://localhost/magasin","root","");
	    System.out.println("bien connectée!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }
    public Connection closeConnection(){
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }
    //fonction pour executer les requetes
    public ResultSet executQuery(String sql){
        connexionDatabase();
        ResultSet resultset=null;
        try {
            statement=connection.createStatement();
            resultset=statement.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return resultset;
    }
    //fonction pour executer la requete update
    public String executionUpdate(String sql){
        connexionDatabase();
        String result="";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result=sql;
        } catch (Exception ex) {
            result =ex.toString();
        }
        return result;
    }
    //requete pour afficher tous
    public ResultSet querySelectAll(String nomTable){
        connexionDatabase();
        SQL = "SELECT * FROM "+nomTable;
        System.out.println(SQL);
        return this.executQuery(SQL);
    }
    //requete pour afficher tous avec parametre
    public ResultSet querySelectAll(String nomTable,String etat){
        connexionDatabase();
        SQL = "SELECT * FROM "+nomTable+" WHERE "+etat ;
        return this.executQuery(SQL);
    }
    public ResultSet querySelect(String[] nomColonne, String nomTable){
        connexionDatabase();
        int i;
        SQL=" SELECT ";
        for(i=0;i<=nomColonne.length-1;i++){
            SQL +=nomColonne[i];
            if(i<nomColonne.length-1){
            SQL +=",";
        }
        }
        SQL +="FROM " +nomTable;
        return this.executQuery(SQL);
    }
    public ResultSet fcSelectCommand(String[] nomColonne, String nomTable,String etat){
        connexionDatabase();
        int i;
        SQL=" SELECT ";
        for(i=0;i<=nomColonne.length-1;i++){
            SQL +=nomColonne[i];
            if(i<nomColonne.length-1){
            SQL +=",";
        }
        }
        SQL +="FROM " +nomTable+" WHERE "+etat;
        return this.executQuery(SQL);
    }
    public String queryInsere(String nomTable,String[] contenuTable){
        connexionDatabase();
        int i;
        SQL=" INSERT INTO "+nomTable+" VALUES (";
        for(i=0;i<=contenuTable.length-1;i++){
            SQL +="'"+contenuTable[i]+"'";
            if(i<contenuTable.length-1){
            SQL +=",";
        }
        }
        SQL+=")";
        return this.executionUpdate(SQL);
    }
    public String queryInsert(String nomTable,String[] nomColonne,String[] contenuTableau){
        connexionDatabase();
        int i;
        SQL = " INSERT INTO "+nomTable+"(";
        for(i=0;i<=nomColonne.length-1;i++){
            SQL +="'"+nomColonne[i]+"'";
            if(i<nomColonne.length-1){
            SQL +=",";
        }
    }
    SQL +=") VALUES(";
    for(i=0;i<=contenuTableau.length-1;i++){
        SQL +="'"+contenuTableau[i]+"'";
        if(i<contenuTableau.length-1){
        SQL +="'";
    }
    }
    SQL +=")";
    return this.executionUpdate(SQL);
  }
    public String queryUpdate(String nomtable,String[] nomColonne,String[] contenuTableau,String etat){
        connexionDatabase();
        int i;
        SQL = " UPDATE "+ nomtable +" SET ";
          for(i=0;i<=nomColonne.length-1;i++){
            SQL +=nomColonne[i]+"='"+contenuTableau[i]+"'";
            if(i<nomColonne.length-1){
            SQL +=",";
        }
    }
    SQL+=" WHERE "+etat;
    return this.executionUpdate(SQL);
  }
    //fonction pour la requete supprimer sans parametre
    public String queryDelete(String nomTable){
        connexionDatabase();
        SQL = " DELETE FROM " +nomTable;
        return this.executionUpdate(SQL);
    }
    //fonction pour la requete supprimer avec parametre
    public String queryDelete(String nomTable, String etat){
        connexionDatabase();
        SQL= " DELETE FROM " + " WHERE " + etat;
        return this.executionUpdate(SQL);
    }
}
    

