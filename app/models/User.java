package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;


@Entity
public class User extends Model {
	
	@Id	
	@Constraints.Min(10)
	public Long Id ;
	
	@Constraints.Required
	public String name ;
	
	public String password;
	
	
	public static Finder<Long , User> find = new Finder<Long , User>(Long.class , User.class);

}
