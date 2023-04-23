# time-reservation-project

Một hệ thống đặt trước tiện ích dịch vụ nơi người dùng có thể đăng nhập và đặt trước thời gian sử dụng các dịch vụ của
trung tâm thể dục như gym, hồ bơi hoặc phòng xông hơi trong khu phức hợp thể thao giả định. Mỗi tiện ích sẽ có một sức 
chứa nhất định (số người có thể sử dụng dịch vụ cùng lúc) để thành viên có thể sử dụng tiện ích một cách thoải mái. 
Các công nghệ được sử dụng trong dự án và các tính năng của dự án được liệt dưới đây:

## Technologies
* Spring Boot
* Thymeleaf
* Hibernate
* Swagger
* Spring Security
* Maven
* JPA
* H2 In-Memory Database
* Bootstrap

## Use Cases / User Stories

* Người dùng sẽ có thể đăng nhập.
* Chúng ta sẽ giả định rằng tài khoản của người dùng đã được tạo trước và tính năng đăng ký sẽ được phát triển sau.
* Người dùng sẽ có thể xem phòng của họ đặt.
* Người dùng có thể đặt chỗ bằng cách chọn loại tiện nghi dịch vụ, ngày và giờ.
* Chỉ người dùng đã đăng nhập mới có thể xem trang đặt chỗ và có thể đặt chỗ dịch vụ.
* Chúng ta nên kiểm tra sức chứa của mỗi dịch vụ và chỉ đặt chỗ mới nếu số lượng đặt chỗ hiện tại không vượt quá sức chứa.
 