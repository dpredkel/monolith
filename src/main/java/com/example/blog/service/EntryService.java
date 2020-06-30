package com.example.blog.service;

import com.example.blog.service.dto.EntryDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.example.blog.domain.Entry}.
 */
public interface EntryService {

    /**
     * Save a entry.
     *
     * @param entryDTO the entity to save.
     * @return the persisted entity.
     */
    EntryDTO save(EntryDTO entryDTO);

    /**
     * Get all the entries.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<EntryDTO> findAll(Pageable pageable);

    /**
     * Get all the entries with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    Page<EntryDTO> findAllWithEagerRelationships(Pageable pageable);


    /**
     * Get the "id" entry.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EntryDTO> findOne(Long id);

    /**
     * Delete the "id" entry.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
