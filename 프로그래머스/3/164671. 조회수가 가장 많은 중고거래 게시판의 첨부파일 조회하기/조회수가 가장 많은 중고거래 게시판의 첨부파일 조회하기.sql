-- 코드를 입력하세요
SELECT
    CONCAT('/home/grep/src/', F.BOARD_ID, '/', F.FILE_ID, F.FILE_NAME, F.FILE_EXT) 
FROM 
    USED_GOODS_FILE F
INNER JOIN USED_GOODS_BOARD B ON B.BOARD_ID = F.BOARD_ID 
WHERE B.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD) 
ORDER BY F.FILE_ID DESC

# 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회
# 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬
# 기본 파일경로 /home/grep/src/ 
#