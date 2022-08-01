package com.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowTransactionRepository extends JpaRepository<BorrowTransaction, Long>
{

}
