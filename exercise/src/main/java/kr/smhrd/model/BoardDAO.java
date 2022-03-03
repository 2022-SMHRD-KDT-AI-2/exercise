package kr.smhrd.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.smhrd.entity.BoardVO;


// JDBC -> Mybatis(SQL Mapping Framework)
public class BoardDAO {
   private static SqlSessionFactory sqlSessionFactory;
   // 초기화블럭(프로그램 실행시 한번만 실행되는 부분)
   static {
         try {
           String resource = "kr/smhrd/model/config.xml";
           InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   // (1) board table에서 게시판 전체리스트를 가져오는 메소드.
   public List<BoardVO> selectAll() {
      SqlSession session=sqlSessionFactory.openSession();
      List<BoardVO> list=session.selectList("selectAll");
      session.close(); // 반납하기
      return list;
      
   }
   // (2) 게시판 등록 메소드.
   public int boardInsert(BoardVO vo) {
      SqlSession session=sqlSessionFactory.openSession();
      int cnt=session.insert("boardInsert", vo);
      session.commit();
      session.close(); // 반납(*)
      return cnt;
   }
   // (3) 주어진 idx에 해당하는 content를 가져오는 메소드
   public BoardVO getByIdx(int idx) {
      SqlSession session=sqlSessionFactory.openSession();
      BoardVO vo=session.selectOne("getByIdx", idx);
      session.close();
      return vo;
   }
   // (4) 주어진 idx에 해당하는 게시물을 삭제하는 메소드
   // (2)처럼 int cnt로 받아서 return을 cnt로 해도 되는데 굳이 안해도 됨, 그냥 void로 해도 됨
   public void boardDelete(int idx) {
      // SqlSession=Connection+Statement
      SqlSession session=sqlSessionFactory.openSession();
      session.delete("boardDelete", idx);
      session.commit();
      session.close();
      }
   
   public void boardUpdate(BoardVO vo) {
      SqlSession session=sqlSessionFactory.openSession();
      session.update("boardUpdate", vo);
      session.commit();
      session.close();
   }
   // 조회수 누적 메소드 addCount()
   public void addCount(int idx) {
      SqlSession session=sqlSessionFactory.openSession();
      session.update("addCount", idx);
      session.commit();
      session.close();
   }
   
} // class의 끝 




