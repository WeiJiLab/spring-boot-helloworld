curl --location --request POST 'localhost:8080/user/addValidate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 123,
    "name": "cxxx",
    "age": 19,
    "gender": "male"
}'
