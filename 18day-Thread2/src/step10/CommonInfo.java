package step10;

import java.io.File;

public interface CommonInfo {
	//인터페이스이므로 public static final 로 자동 인식 ( 상수 ) 
	String MAKE_PATH="C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"repository";//파일 생성하는 디렉토리
	String MOVIE_PATH="C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"movie";//.avi 가 저장될 디렉토리
	String MUSIC_PATH="C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"music";//.music 이 저장될 디렉토리 
}
