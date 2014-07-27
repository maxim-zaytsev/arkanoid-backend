package controllers;

import com.google.gson.Gson;
import models.ScoreRecord;
import play.db.jpa.JPA;
import play.mvc.Controller;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: codein
 * Date: 7/25/14
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Top extends Controller {
  public static void post(String name, int scores){
    ScoreRecord record = new ScoreRecord();
    record.setName(name);
    record.setScores(scores);
    record.save();
    renderText("ok");
  }
  public static void list(){
    List<ScoreRecord> records = ScoreRecord.find("order by scores desc").fetch(10);
    renderJSON(new Gson().toJson(records));
  }
  public static void max(){
    List<ScoreRecord> records = ScoreRecord.find("order by scores desc").fetch(1);
    if(records.size() > 0){
      renderJSON(new Gson().toJson(records.get(0).getScores()));
    } else {
      renderJSON("0");
    }
  }
}
