package com.example.blog.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.blog.web.rest.TestUtil;

public class EntryDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(EntryDTO.class);
        EntryDTO entryDTO1 = new EntryDTO();
        entryDTO1.setId(1L);
        EntryDTO entryDTO2 = new EntryDTO();
        assertThat(entryDTO1).isNotEqualTo(entryDTO2);
        entryDTO2.setId(entryDTO1.getId());
        assertThat(entryDTO1).isEqualTo(entryDTO2);
        entryDTO2.setId(2L);
        assertThat(entryDTO1).isNotEqualTo(entryDTO2);
        entryDTO1.setId(null);
        assertThat(entryDTO1).isNotEqualTo(entryDTO2);
    }
}
