package ch.epfl.sweng.studyup.items;

import java.util.ArrayList;
import java.util.List;

import ch.epfl.sweng.studyup.R;
import ch.epfl.sweng.studyup.player.Player;

import static ch.epfl.sweng.studyup.utils.Constants.CURRENCY_PER_LEVEL;
import static ch.epfl.sweng.studyup.utils.Constants.XP_STEP;
import static ch.epfl.sweng.studyup.utils.GlobalAccessVariables.MOST_RECENT_ACTIVITY;

@SuppressWarnings("HardCodedStringLiteral") // Pain in the ass to translate.
public enum Items {
    XP_POTION(Items.XP_POTION_NAME_ID, Items.XP_POTION_DESCRIPTION_ID, Items.XP_POTION_PRICE),
    COIN_SACK(Items.COIN_SACK_NAME_ID, Items.COIN_SACK_DESCRIPTION_ID, Items.COIN_SACK_PRICE);

    //Names
    public static final int XP_POTION_NAME_ID = R.string.item_xp_potion_name;
    public static final int COIN_SACK_NAME_ID = R.string.item_coin_sack_name;

    //Descriptions
    public static final int XP_POTION_DESCRIPTION_ID = R.string.item_xp_potion_description;
    public static final int COIN_SACK_DESCRIPTION_ID = R.string.item_coin_sack_description;

    //Prices
    public static final int XP_POTION_PRICE = 10;
    public static final int COIN_SACK_PRICE = 10;

    private final int nameId;
    private final int descriptionId;
    private final int price;

    Items(int nameId, int descriptionId, int price) {
        this.nameId = nameId;
        this.descriptionId = descriptionId;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void consume() {
        switch (this) {
            case XP_POTION:
                Player.get().addExperience(XP_STEP, MOST_RECENT_ACTIVITY);
                break;
            case COIN_SACK:
                Player.get().addCurrency(CURRENCY_PER_LEVEL, MOST_RECENT_ACTIVITY);
                break;
            default:
        }
    }

    public String getDescription() {
        return MOST_RECENT_ACTIVITY.getString(descriptionId);
    }

    public String getName() {
        return MOST_RECENT_ACTIVITY.getString(nameId);
    }

    public int getImageName() {
        switch (this) {
            case XP_POTION:
                return R.drawable.potion;
            case COIN_SACK:
                return R.drawable.coin_sack;
            default: throw new IllegalArgumentException("Unknown item");
        }
    }

    public static Items getItemFromName(String name){
        for(Items i : Items.values()){
            if(name.equals(i.getName()))
                return i;
        }
        throw new IllegalArgumentException("Unknown item: " + name);
    }

    public static ArrayList<String> getPlayersItemsNames() {
        List<Items> items = Player.get().getItems();
        ArrayList<String> itemsName = new ArrayList<>(items.size());
        for(int index = 0; index < items.size(); ++index) {
            itemsName.add(index, items.get(index).getName());
        }
        return itemsName;
    }

    public static int countItem(Items item) {
        List<Items> items = Player.get().getItems();
        int counter = 0;
        for (Items i : items) {
            if (i == item) {
                counter += 1;
            }
        }
        return counter;
    }

}