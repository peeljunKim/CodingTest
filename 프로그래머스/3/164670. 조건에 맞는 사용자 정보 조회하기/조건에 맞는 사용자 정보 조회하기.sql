SELECT
    U.USER_ID,
    U.NICKNAME,
    CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', U.STREET_ADDRESS2) AS '전체주소',
    CONCAT(
        SUBSTRING(TLNO,1,3), '-', 
        SUBSTRING(TLNO,4,4), '-', 
        SUBSTRING(TLNO,8,4)
    ) AS 전화번호
FROM 
    USED_GOODS_USER U
INNER JOIN USED_GOODS_BOARD B ON B.WRITER_ID = U.USER_ID
GROUP BY U.USER_ID
HAVING COUNT(*) >= 3
ORDER BY U.USER_ID DESC;

# 중고 거래 게시물 3건 이상 등록한 사용자 = 조건
# 사용자 ID, 닉네임, 전체주소, 전화번호를 조회
# 이때, 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력
# 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입
# 회원 ID를 기준으로 내림차순