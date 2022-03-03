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
   // �ʱ�ȭ��(���α׷� ����� �ѹ��� ����Ǵ� �κ�)
   static {
         try {
           String resource = "kr/smhrd/model/config.xml";
           InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   // (1) board table���� �Խ��� ��ü����Ʈ�� �������� �޼ҵ�.
   public List<BoardVO> selectAll() {
      SqlSession session=sqlSessionFactory.openSession();
      List<BoardVO> list=session.selectList("selectAll");
      session.close(); // �ݳ��ϱ�
      return list;
      
   }
   // (2) �Խ��� ��� �޼ҵ�.
   public int boardInsert(BoardVO vo) {
      SqlSession session=sqlSessionFactory.openSession();
      int cnt=session.insert("boardInsert", vo);
      session.commit();
      session.close(); // �ݳ�(*)
      return cnt;
   }
   // (3) �־��� idx�� �ش��ϴ� content�� �������� �޼ҵ�
   public BoardVO getByIdx(int idx) {
      SqlSession session=sqlSessionFactory.openSession();
      BoardVO vo=session.selectOne("getByIdx", idx);
      session.close();
      return vo;
   }
   // (4) �־��� idx�� �ش��ϴ� �Խù��� �����ϴ� �޼ҵ�
   // (2)ó�� int cnt�� �޾Ƽ� return�� cnt�� �ص� �Ǵµ� ���� ���ص� ��, �׳� void�� �ص� ��
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
   // ��ȸ�� ���� �޼ҵ� addCount()
   public void addCount(int idx) {
      SqlSession session=sqlSessionFactory.openSession();
      session.update("addCount", idx);
      session.commit();
      session.close();
   }
   
} // class�� �� 




