SELECT 
    F.FLAVOR
FROM 
    FIRST_HALF F
INNER JOIN (SELECT *, SUM(TOTAL_ORDER) AS JULY_ORDER FROM JULY 
                GROUP BY FLAVOR
                ORDER BY SHIPMENT_ID) J
ON J.FLAVOR = F.FLAVOR 
ORDER BY (F.TOTAL_ORDER + J.JULY_ORDER) DESC 
LIMIT 3
    
# JULY J ON F.SHIPMENT_ID = J.SHIPMENT_ID

# SELECT * FROM FIRST_HALF ORDER BY SHIPMENT_ID

# SELECT *, SUM(TOTAL_ORDER) FROM JULY 
# GROUP BY FLAVOR
# ORDER BY SHIPMENT_ID


# FIRST_HALF 테이블의 기본 키는 FLAVOR
# FIRST_HALF 테이블의 SHIPMENT_ID는 JULY테이블의 SHIPMENT_ID의 외래 키
# 상반기 주문 정보를 담은 FIRST_HALF 테이블 (출하 번호, 아이스크림 맛, 상반기 총주문량)
# 7월의 아이스크림 주문 정보를 담은 JULY 테이블 (출하 번호, 아이스크림 맛, 7월 총주문량)

# 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 
# 큰 순서대로 상위 3개의 맛을 조회

# 하나의 테이블에만 존재하는 아이스크림이 존재하면??
# 외래키라서 안되겠다