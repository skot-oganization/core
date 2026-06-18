package com.towpen.base.db.model.security.sidebar;

import com.towpen.base.db.model.TOpenSimpleDbEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "menus")
@Getter @Setter
public class Menu extends TOpenSimpleDbEntity {

    private String label;
    // Material Icons codepoint (int). 0/null → frontend Icons.help_outline.
    private Integer icon;
    private boolean submenu;
    private boolean showSubRoute;
    private String link;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private MenuCategory category;

    public Menu(String id, String label, Integer icon, boolean submenu, boolean showSubRoute, String link) {
        this.id = id;
        this.label = label;
        this.icon = icon;
        this.submenu = submenu;
        this.showSubRoute = showSubRoute;
        this.link = link;
    }

    public Menu() {
    }
}

