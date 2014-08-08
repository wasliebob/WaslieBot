package wasliebot.commands;

import java.util.ArrayList;

import wasliebot.helpers.Utils;
import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandDrama implements ICommand{
	public CommandDrama(){
		//Names
		names.add("wasliebo(b)");
		names.add("Vazki(i)");
		names.add("Pokefen(n)");
		names.add("Playe(r)");
		names.add("Nekosun(e)");
		names.add("Tahg");
		names.add("mDiyo");
		names.add("Glassmake(r)");
		names.add("KingLemming");
		names.add("Skyboy");
		names.add("Dan200");
		names.add("Notch");
		names.add("Mikee");
		names.add("RWTema");
		names.add("Jeb_");
		names.add("Pahimar");
		names.add("Grumm");
		names.add("Direwolf20");
		names.add("Jadedcat");
		names.add("Slowpoke");
		names.add("Tonius1(1)");
		names.add("Chickenbones");
		names.add("ProfMobius");
		names.add("Searge");
		names.add("cpw");
		names.add("tterra(g)");
		names.add("Roarax");
		names.add("alexbeg(s)");
		names.add("Drullku(s)");
		names.add("Eloraam");
		names.add("SpitefulFox");
		names.add("WayOfTime");
		names.add("IChun");
		names.add("MineMaarte(n)");
		names.add("K4-(U)");
		names.add("copygirl");
		names.add("Lycanite");
		names.add("Crazypant(s)");
		names.add("Sengi(r)");
		names.add("Mysterious Age(s)");
		names.add("Binnie");
		names.add("BDew");
		names.add("Azano(r)");
		names.add("theFlaxbear(d)");
		names.add("M3gaFr3a(k)");
		names.add("Immibi(s)");
		names.add("Shadowclaime(r)");
		names.add("lclc9(8)");
		names.add("mssodin2(8)");
		names.add("RebelKeith(y)");
		names.add("Aroma199(7)");
		names.add("AtomicStryke(r)");
		names.add("Nuchaz");
		names.add("Itaro(s)");
		names.add("CoverJagua(r)");
		names.add("rich1051414");
		names.add("Myrathi");
		names.add("bspkrs");
		names.add("ganymedes01");
		names.add("VSWE");
		names.add("Lawbroke(n)");
		names.add("LordDus(k)");
		names.add("Cloud(y)");
		names.add("Newcastlegee(k)");
		names.add("dries00(7)");
		names.add("progwml(6)");
		names.add("Cyanide(X)");
		names.add("dmillerw");
		names.add("VikeSte(p)");
		names.add("Sanga(r)");
		names.add("MatrexsVigi(l)");
		names.add("Dynious");
		names.add("AlgorithmX2");
		names.add("AbrarSyed");
		names.add("Othlon");
		names.add("squeek");
		names.add("Benimatic");
		names.add("SpaceToad");
		names.add("Krapht");
		names.add("theZorro266");
		
		//Mods
		mods.add("Thaumcraft Extras");
		mods.add("Forestry Extras");
		mods.add("Modular Machines");
		mods.add("Botania");
		mods.add("Totemic");
		mods.add("Thaumcraft");
		mods.add("Thaumic Exploration");
		mods.add("Industrial Craft");
		mods.add("Thaumic Tinkerer");
		mods.add("ExtraTiC");
		mods.add("Tinkers Construct");
		mods.add("Metallurgy");
		mods.add("Thermal Expansion");
		mods.add("CoFHCore");
		mods.add("MineFactory Reloaded");
		mods.add("Chisel");
		mods.add("Forge Multipart");
		mods.add("Forge Multipart Integration");
		mods.add("OpenBlocks");
		mods.add("Extra Utilies");
		mods.add("Computercraft");
		mods.add("XyCraft");
		mods.add("SimplyJetpacks");
		mods.add("FeedTheBeast");
		mods.add("AgrarianSkies");
		mods.add("Tekkit");
		mods.add("WaslieCore");
		mods.add("NotEnoughItems");
		mods.add("EnderStorage");
		mods.add("WAILA");
		mods.add("AetherCraft");
		mods.add("Equivelent Exchange");
		mods.add("Redpower");
		mods.add("Forbidden Magic");
		mods.add("Blood Magic");
		mods.add("Better Storage");
		mods.add("PneumaticCraft");
		mods.add("Forestry");
		mods.add("Extra Bees");
		mods.add("Extra Trees");
		mods.add("Magic Bees");
		mods.add("Gendustry");
		mods.add("Extra Cells");
		mods.add("EnderIO");
		mods.add("Thaumic Integration");
		mods.add("Baubles");
		mods.add("Minecraft");
		mods.add("BibilioCraft");
		mods.add("Biomes O'Plenty");
		mods.add("ATG");
		mods.add("Extra Biomes");
		mods.add("ChemLab");
		mods.add("RailCraft");
		mods.add("CraftGuide");
		mods.add("Damage Indicators");
		mods.add("Flaxbeard Steampower Mod");
		mods.add("OpenComputers");
		mods.add("HarvestCraft");
		mods.add("Logistic Pipes");
		mods.add("RefinedRelocation");
		mods.add("Applied Energistics");
		mods.add("Twilight Forest");
		mods.add("Buildcraft");
		mods.add("Hexxit");

		//Extras
		extras.add("hates");
		extras.add("sues");
		extras.add("copies");
		extras.add("destroys");
		extras.add("decompiles");
		extras.add("compiles");
		extras.add("scams");
		extras.add("donates");
		extras.add("supports");
		extras.add("Is being weird");
		
		//Reasons
		reasons.add("because a new build is done.");
		reasons.add("because it sucks.");
		reasons.add("because it's weird.");
		reasons.add("because it's overhyped.");
		reasons.add("because " + names.get(Utils.random(0, names.size() - 1)) + " told him to.");
		reasons.add("because it updates way to often.");
		reasons.add("because it's made by a noob.");
		reasons.add("because it adds nothing new.");
		reasons.add("because it's made by " + names.get(Utils.random(0, names.size() - 1)) + ".");
		reasons.add("because it copied code from " + mods.get(Utils.random(0, mods.size() - 1)) + ".");
	}
	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<String> mods = new ArrayList<String>();
	public static ArrayList<String> extras = new ArrayList<String>();
	public static ArrayList<String> reasons = new ArrayList<String>();
	
	@Override
	public void executeCommand(String args, String sender, String channel) {
		WaslieBot.bot.sendMessage(channel, names.get(Utils.random(0, names.size() - 1)) + " " + extras.get(Utils.random(0, extras.size() - 1)) + " " + mods.get(Utils.random(0, mods.size() - 1)) + " " + reasons.get(Utils.random(0, reasons.size() - 1)));
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}