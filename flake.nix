{
  description = "Java Development Environment";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
  };

  outputs = {
    self,
    nixpkgs,
    ...
  }: let
    system = "x86_64-linux";

    pkgs = nixpkgs.legacyPackages.${system};
    jdk = pkgs.jdk25;
  in {
    devShells.${system}.default = pkgs.mkShell {
      nativeBuildInputs = with pkgs; [
        gradle_9
      ];

      JAVA_HOME = jdk.home;
    };
  };
}
