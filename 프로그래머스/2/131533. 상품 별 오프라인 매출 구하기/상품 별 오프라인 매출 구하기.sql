# SELECT * FROM OFFLINE_SALE;

SELECT
    P.PRODUCT_CODE, 
    SUM(O.SALES_AMOUNT * P.PRICE) 
FROM 
    PRODUCT P 
INNER JOIN OFFLINE_SALE O ON P.PRODUCT_ID = O.PRODUCT_ID 
GROUP BY P.PRODUCT_CODE
ORDER BY 
    SUM(O.SALES_AMOUNT * P.PRICE) DESC, 
    P.PRODUCT_CODE ASC;


# PRODUCT / OFFLINE_SALE
# 상품코드는 8자리이며, 앞 2자리는 카테고리 코드 의미
# 동일한 날짜, 상품 id 조합에 대해서 하나의 데이터만 존재

# 상품코드 별 매출액(판매가 * 판매량) 합계를 출력 단 매출액 내림차순 / 같으면 상품 코드 기준 오름차순