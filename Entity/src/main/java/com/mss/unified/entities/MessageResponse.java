package com.mss.unified.entities;


public class MessageResponse {
private String fid11;
private String fied2;
private String fied37;
private String date;
private String mti;

public String getFid11() {
	return fid11;
}
public void setFid11(String fid11) {
	this.fid11 = fid11;
}
public String getFied2() {
	return fied2;
}
public void setFied2(String fied2) {
	this.fied2 = fied2;
}
public String getFied37() {
	return fied37;
}
public void setFied37(String fied37) {
	this.fied37 = fied37;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getMti() {
	return mti;
}
public void setMti(String mti) {
	this.mti = mti;
}


@Override
public String toString() {
	return "messageResponse [fid11=" + fid11 + ", fied2=" + fied2 + ", fied37=" + fied37 + ", date=" + date + ", mti="
			+ mti + "]";
}
@Override
public boolean equals(Object other){
	if (this == other) return true;
	if ( !(other instanceof MessageResponse) ) return false;

    final MessageResponse msg = (MessageResponse) other;
    if (((this.fied2 == null) && (msg.getFied2() != null)) || (((this.fied2 != null) && (msg.getFied2() == null)))) 
    {

    	return false;
    }
    	
    if(msg.getFied2()!=null && this.fied2 !=null)
    	{
    	 if(msg.getFied2().equals(this.getFied2())==false)
    	
    		 return false;
    	}
    
    
    if ((this.fied37 == null) && (msg.getFied37() != null) || ((this.fied37 != null) && (msg.getFied37() == null))) return false;
    if(msg.getFied37()!=null && this.fied37 !=null)
	{
	 if(msg.getFied37().equals(this.getFied37())==false) return false;
	}
    
    if ((this.fid11 == null) && (msg.getFid11() != null) || ((this.fid11 != null) && (msg.getFid11() == null))) return false;
    if(msg.getFid11()!=null && this.fid11 !=null)
	{
	 if(msg.getFid11().equals(this.getFid11())==false) return false;
	}
   
    return true;
  
}

}

