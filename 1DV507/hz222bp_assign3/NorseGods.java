package hz222bp_assign3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import java.util.ArrayList;
/*Assignment 3; Exercise 8
 *Hailing Zhang(hz222bp) 
 *2018-02-27*/
public class NorseGods extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	private ArrayList<String[]> godsList = getGodsList();

	public void start(Stage primaryStage) {
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(1, 10, 6, 7));

		Text title = new Text(5, 20, "Norse Gods and other Beings");
		title.setFont(Font.font(22));
		
		ScrollPane content = new ScrollPane();
		content.setPrefWidth(460);
		content.setPrefHeight(200);

		ListView<String> catalog = new ListView<>();
		catalog.setPrefWidth(140);
		catalog.setPrefHeight(200);
		catalog.setOnMouseClicked(e -> {
			int Index = catalog.getSelectionModel().getSelectedIndex();// get content from arraylist
			String[] data = godsList.get(Index); // according to the index
			Text name = new Text(data[0] + "\n");
			name.setFont(Font.font(18));
			Text race = new Text(data[1] + "\n");
			Text desc = new Text(data[2]);
			desc.setWrappingWidth(100);
			TextFlow tf = new TextFlow();
			tf.setMaxWidth(450);
			tf.setPadding(new Insets(3, 3, 3, 3));
			tf.getChildren().addAll(name, race, desc);
			content.setContent(tf);
		});
		for (int i = 0; i < godsList.size(); i++)
			catalog.getItems().add(godsList.get(i)[0]);

		// Layout
		bp.setTop(title);
		bp.setLeft(catalog);
		bp.setRight(content);
		Scene scene = new Scene(bp, 630, 430);
		primaryStage.setTitle("Norse Gods");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static ArrayList<String[]> getGodsList() {
		ArrayList<String[]> godslist = new ArrayList<String[]>();
		godslist.add(new String[] { "Freyja", "Vanir",
				"Freya (Old Norse Freyja, “Lady”) is one of the preeminent goddesses in Norse mythology. She’s a member of the Vanir tribe of deities, but became an honorary member of the Aesir gods after the Aesir-Vanir War. Her father is Njord. Her mother is unknown, but could be Nerthus. Freyr is her brother. Her husband, named Odr in late Old Norse literature, is certainly none other than Odin, and, accordingly, Freya is ultimately identical with Odin’s wife Frigg (see below for a discussion of this)."
						+ "\n"
						+ "Freya is famous for her fondness of love, fertility, beauty, and fine material possessions – and, because of these predilections, she’s considered to be something of the “party girl” of the Aesir. In one of the Eddic poems, for example, Loki accuses Freya (probably accurately) of having slept with all of the gods and elves, including her brother. She’s certainly a passionate seeker after pleasures and thrills, but she’s a lot more than only that. "
						+ "\n"
						+ "Freya is the archetype of the völva, a professional or semiprofessional practitioner of seidr, the most organized form of Norse magic. It was she who first brought this art to the gods,and, by extension, to humans as well. Given her expertise in controlling and manipulating the desires, health, and prosperity of others, she’s a being whose knowledge and power are almost without equal."
						+ "\n"
						+ "Freya presides over the afterlife realm Folkvang. According to one Old Norse poem, she chooses half of the warriors slain in battle to dwell there. (See Death and the Afterlife.)" });
		godslist.add(new String[] { "Loki", "Jotuns",
				"Loki has been depicted in or is referred to in an array of media in modern popular culture. During the 19th century, Loki was depicted in a variety of manners, sometimes strongly at odds. According to Stefan Arvidssen, \"the conception of Loki varied during the nineteenth century. Sometimes he was presented as a dark-haired Semitic fifth columnist among the Nordic Aesir, but sometimes he was described as a Nordic Prometheus, a heroic bearer of culture\". Famously, Loki appears in Richard Wagner's opera cycle Ring of the Nibelung as Loge (a play on Old Norse loge \"fire\"). He is depicted as an ally of the gods (specifically Wotan's assistant rather than Donner's), although he generally dislikes them and thinks of them as greedy, as they refuse to return the Rhine Gold to its rightful owners. In the conclusion of the first opera Das Rheingold he reveals his hope to turn into fire and destroy Valhalla, and in the final opera Götterdämmerung Valhalla is set alight, destroying the Gods."
						+ "\n"
						+ "The etymology of the name Loki has been extensively debated. The name has at times been associated with the Old Norse word logi ('flame'), but there seems not to be a sound linguistic basis for this. Rather, the later Scandinavian variants of the name (such as Faroese Lokki, Danish Lokkemand, Norwegian Loke and Lokke, Swedish Luki and Luku, along with Finnish Lukki) point to an origin in the Germanic root *luk-, which denoted things to do with loops (like knots, hooks, closed-off rooms, and locks). This corresponds with usages such as the Swedish lokkanät and Faroese Lokkanet ('cobweb', literally 'Lokke's web') and Faroese lokki~grindalokki~grindalokkur ('daddy-long-legs', associated in pre-modern folk-taxonomy with spiders). Some Eastern Swedish traditions referring to the same figure use forms in n- like Nokk(e), but this corresponds to the *luk- etymology insofar as those dialects consistently used a different root, Germanic *hnuk-, in contexts where western varieties used *luk-: \"nokke corresponds to nøkkel\" ('key' in Eastern Scandinavian) \"as loki~lokke to lykil\" ('key' in Western Scandinavian).[1] While it has been suggested that this association with closing could point to Loki's apocalyptic role at Ragnarök,[2] \"there is quite a bit of evidence that Loki in premodern society was thought to be the causer of knots/tangles/loops, or himself a knot/tangle/loop. Hence, it is natural that Loki is the inventor of the fishnet, which consists of loops and knots, and that the word loki (lokke, lokki, loke, luki) is a term for makers of cobwebs: spiders and the like.\" Though not prominent in the oldest sources, this identity as a \"tangler\" may be the etymological meaning of Loki's name.\\nIn various poems from the Poetic Edda (stanza 2 of Lokasenna, stanza 41 of Hyndluljóð, and stanza 26 of Fjölsvinnsmál), and sections of the Prose Edda (chapter 32 of Gylfaginning, stanza 8 of Haustlöng, and stanza 1 of Þórsdrápa) Loki is alternately referred to as Loptr, which is generally considered derived from Old Norse lopt meaning \"air\", and therefore points to an association with the air.\\nThe name Hveðrungr (Old Norse '?roarer') is also used in reference to Loki, occurring in names for Hel (such as in Ynglingatal; hveðrungs mær) and in reference to Fenrir (as in Völuspa)." });
		godslist.add(new String[] { "Skadi", "Giants",
				"Skadi is the Goddess of Winter and of the Hunt. She is married to Njord, the gloomy Sea God, noted for his beautiful bare feet (which is how Skadi came to choose him for her mate.) Supposedly the bare foot is an ancient Norse symbol of fertility. The marriage wasn’t too happy, though, because she really wanted Balder for her husband. She is the goddess of Justice, Vengeance, and Righteous Anger, and is the deity who delivers the sentence upon Loki to be bound underground with a serpent dripping poison upon his face in payment for his crimes. Skadi’s character is represented in two of Hans Christian Anderson’s tales: “The Snow Queen” and “The Ice Princess.”"
						+ "\n"
						+ "In Norse mythology, Skaði (sometimes anglicized as Skadi, Skade, or Skathi) is a jötunn and goddess associated with bowhunting, skiing, winter, and mountains. Skaði is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; the Prose Edda and in Heimskringla, written in the 13th century by Snorri Sturluson, and in the works of skalds."
						+ "In all sources, Skaði is the daughter of the deceased Þjazi, and Skaði married the god Njörðr as part of the compensation provided by the gods for killing her father Þjazi. In Heimskringla, Skaði is described as having split up with Njörðr and as later having married the god Odin, and that the two produced many children together. In both the Poetic Edda and the Prose Edda, Skaði is responsible for placing the serpent that drips venom onto the bound Loki. Skaði is alternately referred to as Öndurguð (Old Norse 'ski god') and Öndurdís (Old Norse 'ski dís')."
						+ "\n"
						+ "The etymology of the name Skaði is uncertain, but may be connected with the original form of Scandinavia. Some place names in Scandinavia refer to Skaði. Scholars have theorized a potential connection between Skaði and the god Ullr (who is also associated with skiing), a particular relationship with the jötunn Loki, and that Scandinavia may be related to the name Skaði (potentially meaning 'Skaði's island') or the name may be connected to an Old Norse noun meaning 'harm'. Skaði has inspired various works of art." });
		godslist.add(new String[] { "Brynhild", "Valkyries",
				"Brynhildr (also spelled Brünhild, Brunnhilde, Brynhild) is a shieldmaiden and a valkyrie in Germanic mythology, where she appears as a main character in the Völsunga saga and some Eddic poems treating the same events. Under the name Brünnhild she appears in the Nibelungenlied and therefore also in Richard Wagner's opera cycle Der Ring des Nibelungen. She may be inspired by the Visigothic princess Brunhilda of Austrasia. The history of Brynhildr includes fratricide, a long battle between brothers, and dealings with the Huns. She is also known as Sigrdrífa, as written in the poem Sigrdrífumál."
						+ "\n"
						+ "According to the Völsunga saga, Brynhildr is a shieldmaiden and seemingly valkyrie who is the daughter of Budli. She was ordered to decide a fight between two kings, Hjalmgunnar and Agnar, and knew that Odin preferred the older king, Hjalmgunnar, yet she decided the battle for Agnar. For this Odin condemned her to live the life of a mortal woman, and imprisoned her in a remote castle behind a wall of shields on top of mount Hindarfjall, where she sleeps in a ring of flames until any man rescues and marries her. The hero Sigurðr Sigmundson (Siegfried in the Nibelungenlied), heir to the clan of Völsung and slayer of the dragon Fafnir, entered the castle and awoke Brynhildr by removing her helmet and cutting off her chainmail armour. The two fell in love and Sigurðr proposed to her with the magic ring Andvaranaut. The Völsunga saga also describes a subsequent encounter between Sigurðr and Brynhildr at Hlymdale, the home of Brynhildr's brother-in-law, Heimir. There Sigurðr declared his love for the shieldmaiden after spotting her in her tower. Promising to return and make Brynhildr his bride, Sigurðr then headed for the court of Gjuki, the King of Burgundy. Following Sigurðr's departure, Brynhildr was visited by Gudrun, the daughter of Gjuki, who sought her aid in interpreting a dream. This dream presaged Sigurðr's betrayal of Brynhildr and marriage to Gudrun." });
		godslist.add(new String[] { "Motsognir", "Dwarfs",
				"In Norse mythology, Mótsognir (Old Norse \"battle roarer\") is the father of the Dwarfs, and resides in Niðavellir (Old Norse \"dark fields\")."
						+ "\n"
						+ "According to the text of the Codex Regius the gods created only the main dwarfs, Mótsognir and Durinn, who then started to make 'humanlike' figures of the other dwarfs. " });
		godslist.add(new String[] { "Nanna", "Ásynjur",
				"In Norse mythology, Nanna Nepsdóttir or simply Nanna is a goddess associated with the god Baldr. Accounts of Nanna vary greatly by source. In the Prose Edda, written in the 13th century by Snorri Sturluson, Nanna is the wife of Baldr and the couple produced a son, the god Forseti. After Baldr's death, Nanna dies of grief. Nanna is placed on Baldr's ship with his corpse and the two are set aflame and pushed out to sea. In Hel, Baldr and Nanna are united again. In an attempt to bring back Baldr from the dead, the god Hermóðr rides to Hel and, upon receiving the hope of resurrection from the being Hel, Nanna gives Hermóðr gifts to give to the goddess Frigg (a robe of linen), the goddess Fulla (a finger-ring), and others (unspecified). Nanna is frequently mentioned in the poetry of skalds and a Nanna, who may or may not be the same figure, is mentioned once in the Poetic Edda, compiled in the 13th century from earlier traditional sources."
						+ "\n"
						+ "An account provided by Saxo Grammaticus in his 12th century work Gesta Danorum records Nanna as a human female, the daughter of King Gevar, and the love interest of both the demi-god Baldr and the human Höðr. Spurred by their mutual attraction to Nanna, Baldr and Höðr repeatedly do battle. Nanna is only interested in Höðr and weds him, while Baldr wastes away from nightmares about Nanna."
						+ "\n"
						+ "The Setre Comb, a comb from the 6th or early 7th century featuring runic inscriptions, may reference the goddess. The etymology of the name Nanna is a subject of scholarly debate. Scholars have debated connections between Nanna and other similarly named deities from other cultures and the implications of the goddess's attestations." });
		godslist.add(new String[] { "Sargeras", "Titan",
				"Like all titans, Sargeras was born from a world-soul maturing within a planet in the Great Dark Beyond. He was the mightiest warrior of the titan Pantheon and originally possessed the title \"The Defender\" and was the \"noblest of all\".Like the rest of his kind, he was altruistic and just, unable to conceive of pure evil.When the chaotic demons, spawn of the Twisting Nether, began to threaten the Pantheon's work of bringing order to worlds in the Great Dark, Sargeras was sent to battle them. Sargeras continued defeating the disorganized and incompetent demons with ease, but he also soon discovered that some demons had begun wielding the dark energies of the Void. The Defender also suspected the existence of malevolent beings far more powerful than mere demons who sought to influence the physical universe hidden behind the veil of the Void. The presence of these beings troubled Sargeras, but he nonetheless continued his work.To his dismay, Sargeras soon discovered that the demons he had defeated simply returned to the Twisting Nether to be reborn in new bodies and continue to torment the worlds of the Great Dark. The Pantheon grew concerned about this development and the increase of demonic activity, and so sent the inexperienced titan Aggramar to aid Sargeras in battle. Aggramar proved a quick study and soon earned Sargeras' admiration, and became the warrior's trusted lieutenant. The two fought shoulder to shoulder against the endless demons of the Nether. This allowed Sargeras to more closely study the nature of the Nether, and by learning how to manipulate the chaotic realm's magical energies, he created a prison world known as Mardum to contain the demons he had defeated (though in Mardum, the demons were not idle; a nathrezim named Ulthalesh, in particular, ruled the pocket dimension with an iron fist, plotting his vengeance). Demonic invasions became increasingly rare, and together, the two titans soon brought peace to the cosmos." });
		godslist.add(new String[] { "Fornjót", "Giants",
				"In Norse mythology, Fornjót (Old Norse: Fornjótr) was an ancient giant and king of \"Gotland, Kænland and Finnland\" meaning Gotland, Kvenland and Finland Proper.His children are Ægir (the ruler of the sea), Logi (fire giant) and Kári (god of wind).The name has often been interpreted as forn-jótr \"ancient giant\", and Karl Simrock (1869) because of this identified Fornjotr with the primeval giant Ymir. But it is also possible, as was suggested by Peter Erasmus Müller (1818),that it is one of a well-established group of names or titles of gods in -njótr \"user, owner, possessor\", which would make Fornjótr the \"original owner\" (primus occupans vel utens) of Norway.Logi appears by that name in Gylfaginning in the tale of Thor and Loki's journey to the castle of the giant Útgarða-Loki in Jötunheimr where Loki was pitted against Logi in an eating contest. The contestants appeared to be equal in speed at eating meat from the bone, but Logi also consumed the bones and even the wooden trencher in which the meat was placed. Útgarða-Loki afterwards explained that Logi was really fire itself.In the Ynglinga saga the names Logi and Frosti are otherwise connected when it relates that King Agni of Sweden in a raid on Finland killed Frosti, the leader of the Finns who opposed him and captured Skjálf, Frosti's daughter, and her brother Logi. (But the verse of the Ynglingtal quoted here as confirmation says only that Skjálf is Logi's kin.) For Skjálf's marriage to Agni and her vengeance on him see Agni. Agni himself, as discussed under Snær, is here a descendant of Snær through Snær's daughter Drífa who married King Vanlandi of Sweden."
						+ "\n"
						+ "This account cannot be reconiciled with the account in the Hversu and Orkneyinga saga without assuming multiple figures with the same names. In Thorsteins saga Víkingssonar, Logi (a descendant of giants) is the husband to a niece of King Álf the Old of Álfheim who himself is the husband of Bergdís the daughter of King Raum (Raumr) of Raumaríki. In the other accounts Logi is the brother of Kári who is a distant ancestor of Raum the Old who is father of Álf or Finnálf (Finnálfr), king of Álfheim." });
		godslist.add(new String[] { "Jörmungandr", "Dragon",
				"In Norse mythology, Jörmungandr (Old Norse: Jǫrmungandr, pronounced [ˈjɔrmuŋɡandr̥], meaning \"huge monster\"), also known as the Midgard (World) Serpent (Old Norse: Miðgarðsormr), is a sea serpent, the middle child of the giantess Angrboða and Loki. According to the Prose Edda, Odin took Loki's three children by Angrboða — the wolf Fenrir, Hel, and Jörmungandr — and tossed Jörmungandr into the great ocean that encircles Midgard.The serpent grew so large that it was able to surround the earth and grasp its own tail.[2] As a result, it received the name of the Midgard Serpent or World Serpent. When it releases its tail, Ragnarök will begin. Jörmungandr's arch-enemy is the thunder-god, Thor. It is an example of an ouroboros."
						+ "\n"
						+ "The major sources for myths about Jörmungandr are the Prose Edda, the skaldic poem Húsdrápa, and the Eddic poems Hymiskviða and Völuspá. Other sources include kennings in other skaldic poems. For example, in Þórsdrápa, faðir lögseims, \"father of the sea-thread\", is used as a kenning for Loki. There are also image stones from ancient times depicting the story of Thor fishing for Jörmungandr." });
		godslist.add(new String[] { "Sylvanas", "Undead",
				"Sylvanas Windrunner (the Dark Lady, Queen of the Forsaken) is the former Ranger-General of Silvermoon. She currently serves as leader of the Forsaken faction of undead and Warchief of the Horde after the Battle on the Broken Shore. She is the middle sister of Alleria and Vereesa Windrunner.When Arthas Menethil and the Scourge came to Quel'Thalas for the Sunwell, Sylvanas attempted to defend her homeland. After fighting and losing at every turn to his forces, Arthas killed her. In revenge for her stubbornness, he severed her soul from her body, forcing her to serve him and aid him in the destruction of her beloved city.During the time when the Lich King was losing grasp on his undead minions, Sylvanas gained her free will and plotted against him in Lordaeron with the help of the Nathrezim. After her assassination attempt failed, she turned her attention to claiming Lordaeron for herself. She bent the dreadlord, Varimathras, to her will and, with the help of the human remnants led by lord Garithos, killed Balnazzar and Detheroc. With the death of the dreadlords and Garithos, together with the disbanding of the human remnants, Sylvanas was able to claim Lordaeron and made her home under the former Capital City, naming it \"The Undercity.\"."
						+ "\n"
						+ "Sylvanas gathered her forces to warn Silvermoon, but Arthas blocked her passage at every turn, murdering every runner she tried to get through. Sylvanas continued the resistance, but eventually was targeted. Arthas's army overran her base of operations and the death knight singled her out in the heat of battle. The two dueled, and Sylvanas was cut down." });
		return godslist;
	}
}
