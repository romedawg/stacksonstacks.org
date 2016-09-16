package org.stacksonstacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stacksonstacks.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
