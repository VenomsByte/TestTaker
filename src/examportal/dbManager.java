/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class dbManager {
    
       public static ArrayList<Question> getQuestions(String subject, String level){
        ArrayList<Question> list = new ArrayList<Question>();
         try
        {
             
            MainClass mc=new MainClass();
             //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            PreparedStatement ps = connection.prepareStatement("Select * from Questions where Subject=? and DifficultyLevel=?");
            ps.setString(1, subject);
            ps.setString(2, level);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Question q = new Question();
                q.setQuestionId(rs.getInt(1));
                q.setQuestionText(rs.getString(2));
                q.setOptionA(rs.getString(3));
                q.setOptionB(rs.getString(4));
                q.setOptionC(rs.getString(5));
                q.setOptionD(rs.getString(6));
                q.setCorrectAnswer(rs.getString(7));
                q.setSubject(rs.getString(8));
                q.setDifficultyLevel(rs.getString(9));
                list.add(q);
            }
            rs.close();
            ps.close();
        }
        catch(Exception e){}       
        return list;
    }    
     // </editor-fold>
        public static void saveReport(ExamReport r){
        try
        {
            MainClass mc=new MainClass();
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            PreparedStatement ps = connection.prepareStatement("Insert into reports(UserId,UserName,ExamDate,Subject,Level,TotalQuestions,CorrectQuestions,Score) values (?,?,?,?,?,?,?,?)");
            ps.setString(1,System.getProperty("userId"));
            ps.setString(2,r.getFirstName());
            ps.setString(3,r.getExamDate());
            ps.setString(4,r.getSubject());
            ps.setString(5,r.getLevel());
            ps.setString(6,""+r.getNumberOfQuestions());
            ps.setString(7,""+r.getCorrect());
            ps.setString(8,r.getScore()+"%");
            ps.executeUpdate();
            ps.close();
        }
        catch(Exception e){}  
    }
         public static String[] getSubjects(){
        ArrayList<String> list = new ArrayList<String>();
         try
        {
             MainClass mc=new MainClass();
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            PreparedStatement ps = connection.prepareStatement("Select * from Subjects");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString(1));
            }
            rs.close();
            ps.close();
        }
        catch(Exception e){}  
        Collections.sort(list);
        String[] subjects = new String[list.size()];
        for(int i=0;i<list.size();i++){
            subjects[i] = list.get(i);
        }            
        return subjects;
    }
         

}
