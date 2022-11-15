/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.isra.peminjaman.nasabah.repository;

import com.isra.peminjaman.nasabah.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long>{

    public Peminjaman findByPeminjamanId(Long peminjamanId);
    
}
