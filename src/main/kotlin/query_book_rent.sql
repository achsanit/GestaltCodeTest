

--- QUERY MENAMPILKAN BUKU 
--- YANG BELUM PERNAH DIPINJAM SAMA SEKALI

	SELECT b.id, b.title, b.author, b.price_rent, b.book_category
	FROM book b
	LEFT JOIN rent r ON b.id = r.book_id
	WHERE r.id IS NULL;
	
	
--- QUERY MENAMPILKAN BUKU 
--- DENGAN HARGA KURANG DARI 6000 DAN LEBIH DARI 2000
	
	SELECT id, title, author, price_rent, book_category
	FROM book
	WHERE price_rent > 2000 AND price_rent < 6000;
	

--- QUERY UNTUK MENAMPILKAN  
--- DATA CUSTOMER YANG TELAH MEMINJAM LEBIH DARI 10 KALI
	
	SELECT c.name AS nama_customer, b.title AS judul_buku, COUNT(*) AS jumlah_peminjaman
	FROM customer c
	JOIN rent r ON c.id = r.customer_id
	JOIN book b ON r.book_id = b.id
	GROUP BY c.id, b.id
	HAVING COUNT(*) > 10;
